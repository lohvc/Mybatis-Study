package com.lohvc.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * \* User: lohvc
 * \* Date: 2020/2/16
 * \* Time: 21:48
 * \
 */
public class MybatisUtils {

    private static SqlSessionFactory sqlSessionFactory;
    static {
        String resource="mybatis-config.xml";
        try {
            InputStream inputStream= Resources.getResourceAsStream(resource);
            sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
