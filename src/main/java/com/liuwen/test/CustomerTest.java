package com.liuwen.test;

import com.liuwen.entity.Customer;
import com.liuwen.entity.Student;
import com.liuwen.repository.CustomerRepository;
import com.liuwen.repository.StudentRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author: Liu Wen
 * @create: 2020-02-23 14:12
 * @description: Good good study,day day up!
 **/
public class CustomerTest {
    public static void main(String[] args) {

        InputStream inputStream =
                AccountTest2.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new
                SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory =
                sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CustomerRepository customerRepository = sqlSession.getMapper(CustomerRepository.class);
        Customer result = customerRepository.findById(1);
        System.out.println(result);
        sqlSession.close();
    }
}
