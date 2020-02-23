package com.liuwen.test;

import com.liuwen.entity.Account;
import com.liuwen.repository.AccountRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author: Liu Wen
 * @create: 2020-02-23 18:18
 * @description: Good good study,day day up!
 **/
public class CachingTest {
    public static void main(String[] args){
        InputStream inputStream = AccountTest2.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountRepository accountRepository = sqlSession.getMapper(AccountRepository.class);
        Account account = accountRepository.findById(2);
        System.out.println(account);
        //一级缓存默认打开,两次相同的查询只查询一次
        Account account1 = accountRepository.findById(2);
        System.out.println(account1);
        sqlSession.close();

        //重新打开一个sqlsession，则重新查询（若打开二级缓存，则仍然仅查询一次）
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        AccountRepository accountRepository2 = sqlSession2.getMapper(AccountRepository.class);
        Account account2 = accountRepository2.findById(2);
        System.out.println(account2);
    }
}
