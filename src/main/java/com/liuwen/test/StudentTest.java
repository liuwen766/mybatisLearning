package com.liuwen.test;

import com.liuwen.entity.Classes;
import com.liuwen.entity.Student;
import com.liuwen.repository.AccountRepository;
import com.liuwen.repository.ClassesRepository;
import com.liuwen.repository.StudentRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author: Liu Wen
 * @create: 2020-02-23 13:31
 * @description: Good good study,day day up!
 **/
public class StudentTest {
    public static void main(String[] args){
        InputStream inputStream =
                AccountTest2.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new
                SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory =
                sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
       ClassesRepository classesRepository =
                sqlSession.getMapper( ClassesRepository.class);
        Classes result = classesRepository.findById(1);
        System.out.println(result);
        sqlSession.commit();
        sqlSession.close();
    }
}
