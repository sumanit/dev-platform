package com.github.sumanit.devplatform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author suman6
 * @version 1.0
 * @date 2020/6/13 8:22 下午
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("/")
    public Object Test(){
        DatabaseMetaData metaData = null;
        try {
            metaData = dataSource.getConnection().getMetaData();
            ResultSet tableSet = metaData.getTables(null, "%", "%", new String[]{"TABLE"});
            while(tableSet.next()){
                String string = tableSet.getString("TABLE_NAME");
                System.out.println(string);
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return "";
    }
}
