package com.github.sumanit.devplatform.conf;

import com.github.sumanit.devplatform.interceptor.MyInterceptor;
import com.github.sumanit.devplatform.interceptor.ResultInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Properties;

/**
 * @author suman6
 * @version 1.0
 * @date 2020/6/14 10:19 上午
 */
@Configuration
public class InterceptorConfiguration {
    @Autowired
    private List<SqlSessionFactory> sqlSessionFactoryList;
    @PostConstruct
    public void addInterceptor(){
        for (SqlSessionFactory sqlSessionFactory : sqlSessionFactoryList) {
            sqlSessionFactory.getConfiguration().addInterceptor(new MyInterceptor());
            sqlSessionFactory.getConfiguration().addInterceptor(new ResultInterceptor());
        }
    }
}
