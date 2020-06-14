package com.github.sumanit.devplatform.interceptor;

import com.github.sumanit.devplatform.model.ProjectInfo;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.select.*;
import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Properties;

/**
 * @author suman6
 * @version 1.0
 * @date 2020/6/14 10:34 上午
 */
@Intercepts(
        {
                @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}),
                @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class, CacheKey.class, BoundSql.class}),
                @Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class}),
        }
)
public class MyInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Method method = invocation.getMethod();
        if("query".equals(method.getName())){
            System.out.println("执行query");
            return processQuery(invocation);
        }else if("update".equals(method.getName())){
            System.out.println("执行update");
            return processUpdate(invocation);
        }
        return null;
    }

    public Object processQuery(Invocation invocation) throws Throwable {
        Object[] args = invocation.getArgs();
        MappedStatement ms = (MappedStatement) args[0];
        Object parameter = args[1];
        RowBounds rowBounds = (RowBounds) args[2];
        ResultHandler resultHandler = (ResultHandler) args[3];
        Executor executor = (Executor) invocation.getTarget();
        CacheKey cacheKey;
        BoundSql boundSql;
        //由于逻辑关系，只会进入一次
        if(args.length == 4){
            //4 个参数时
            boundSql = ms.getBoundSql(parameter);
            cacheKey = executor.createCacheKey(ms, parameter, rowBounds, boundSql);
        } else {
            //6 个参数时
            cacheKey = (CacheKey) args[4];
            boundSql = (BoundSql) args[5];
        }
        String sql = processSQL(boundSql.getSql());
        //生成分页的缓存 key
        CacheKey pageKey = cacheKey;
        String msId = ms.getId();
        Configuration configuration = ms.getConfiguration();
        BoundSql pageBoundSql = new BoundSql(configuration, sql, boundSql.getParameterMappings(), parameter);
        List<Object> result = executor.query(ms, parameter, RowBounds.DEFAULT, resultHandler, cacheKey, pageBoundSql);
        for (Object o : result) {
            if(o instanceof ProjectInfo){
                ProjectInfo projectInfo = (ProjectInfo) o;
                projectInfo.setName(projectInfo.getName()+"dsfadsfs");
            }
        }
        return result;
    }

    public Object processUpdate(Invocation invocation) throws Throwable {
        Object[] args = invocation.getArgs();
        MappedStatement ms = (MappedStatement) args[0];
        Object parameter = args[1];
        Executor executor = (Executor) invocation.getTarget();
        BoundSql boundSql = ms.getBoundSql(parameter);

        return executor.update(ms, parameter);
    }

    public String processSQL(String sql){
        //解析SQL
        Statement stmt = null;

        try {
            stmt = CCJSqlParserUtil.parse(sql);
            Select select = (Select) stmt;
            SelectBody selectBody = select.getSelectBody();
            PlainSelect plainSelect = (PlainSelect) selectBody;
            List<SelectItem> selectItems = plainSelect.getSelectItems();
            for (SelectItem selectItem : selectItems) {
                if(selectItem instanceof SelectExpressionItem){
                    SelectExpressionItem selectExpressionItem = (SelectExpressionItem) selectItem;
                    Expression expression = selectExpressionItem.getExpression();
                    if(expression instanceof Column){
                        Column column = (Column) expression;
                        if("`name`".equals(column.getColumnName())) {
                            column.setColumnName("name_encrypted");
                        }
                    }
                }
                System.out.println(selectItem);
            }
            //selectItems.stream().map(item->(SelectExpressionItem)item).filter(item->item.getExpression())

        } catch (Throwable e) {
        }
        return stmt.toString();
    }

    @Override
    public Object plugin(Object target) {

        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
