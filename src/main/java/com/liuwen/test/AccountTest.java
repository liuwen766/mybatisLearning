package com.liuwen.test;

import com.liuwen.entity.Account;
import org.apache.ibatis.session.*;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author: Liu Wen
 * @create: 2020-02-23 11:52
 * @description: Good good study,day day up!
 **/
public class AccountTest {
       public static void main(String[] args){
           InputStream inputStream = AccountTest.class.getClassLoader().getResourceAsStream("config.xml");
           SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
           SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
           SqlSession  sqlSession = sqlSessionFactory.openSession();
           String statement = "com.liuwen.mapper.AccountMapper.save";
           Account account = new Account(1,"xixi","123456",18);
           int result = sqlSession.insert(statement,account);
           System.out.println(result);
           sqlSession.commit();
           sqlSession.close();

       }
}
