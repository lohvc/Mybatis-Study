package com.lohvc.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * \* User: lohvc
 * \* Date: 2020/2/17
 * \* Time: 15:57
 * \
 */
public class MybatisUtils {
     private static SqlSessionFactory sqlSessionFactory;
     static {
         String resources = "mybatis-config1.xml";
         try {
             InputStream resourceAsStream = Resources.getResourceAsStream(resources);
             sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

         }catch (Exception e){
             e.printStackTrace();
         }

     }
     public static SqlSession getSqlSession(){
         return sqlSessionFactory.openSession();
     }
}
