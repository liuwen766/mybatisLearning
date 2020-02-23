package com.liuwen.test;

import com.liuwen.entity.Account;
import com.liuwen.repository.AccountRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.InputStream;
import java.util.List;

/**
 * @author: Liu Wen
 * @create: 2020-02-23 13:14
 * @description: Good good study,day day up!
 **/
public class AccountTest2 {

        public static void main(String[] args) {
            InputStream inputStream = AccountTest2.class.getClassLoader().getResourceAsStream("config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
//获取实现接⼝口的代理理对象
            AccountRepository accountRepository = sqlSession.getMapper(AccountRepository.class);
//添加对象
// Account account = new Account(0,"王五","111111",24);
// int result = accountRepository.save(account);
// System.out.println(result);
// sqlSession.commit();
//查询全部对象
// List<Account> list = accountRepository.findAll();
// for (Account account:list){
// System.out.println(account);
// }
// sqlSession.close();
//通过id查询对象
// Account account = accountRepository.findById(3L);
// System.out.println(account);
// sqlSession.close();
//修改对象
// Account account = accountRepository.findById(3L);
// account.setUsername("⼩小明");
// account.setPassword("000");
// account.setAge(18);
// int result = accountRepository.update(account);
// sqlSession.commit();
// System.out.println(result);
// sqlSession.close();
//通过id删除对象
            int result = accountRepository.deleteById(3);
            System.out.println(result);
            sqlSession.commit();
            sqlSession.close();
        }
    }
