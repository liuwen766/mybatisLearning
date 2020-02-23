package com.liuwen.test;

import com.liuwen.entity.Student;
import com.liuwen.repository.StudentRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author: Liu Wen
 * @create: 2020-02-23 13:40
 * @description: Good good study,day day up!
 **/
public class CalssesTest {
    public static void main(String[] args){
        InputStream inputStream =
                AccountTest2.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new
                SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory =
                sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentRepository studentRepository =
                sqlSession.getMapper(StudentRepository.class);
        Student result = studentRepository.findById(3L);
        System.out.println(result);
        sqlSession.commit();
        sqlSession.close();
    }
}
