package com.github.sumanit.devplatform.interceptor;

import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.plugin.*;

import java.lang.reflect.Method;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author suman6
 * @version 1.0
 * @date 2020/6/14 10:34 上午
 */
@Intercepts(
        {
                @Signature(type = ResultSetHandler.class, method = "handleResultSets", args = {Statement.class}),
        }
)
public class ResultInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Method method = invocation.getMethod();
        Object[] args = invocation.getArgs();
        Statement statement = (Statement) args[0];
        ResultSetHandler target = (ResultSetHandler) invocation.getTarget();
        return target.handleResultSets(statement);
    }


    @Override
    public Object plugin(Object target) {

        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
