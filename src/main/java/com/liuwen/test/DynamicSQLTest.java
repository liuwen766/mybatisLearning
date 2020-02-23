package com.liuwen.test;

import com.liuwen.entity.Account;
import com.liuwen.repository.AccountRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author: Liu Wen
 * @create: 2020-02-23 18:43
 * @description: Good good study,day day up!
 **/
public class DynamicSQLTest {
    public static void main(String[] args){
        InputStream inputStream = AccountTest2.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Account account = new Account();
//        account.setId(1);
        account.setUsername("张三");
        account.setPassword("123456");
        account.setAge(99);
        AccountRepository accountRepository = sqlSession.getMapper(AccountRepository.class);
        Account resullt = accountRepository.findByAccount(account);
        System.out.println(resullt);
        sqlSession.close();
    }
}
