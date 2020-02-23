package com.liuwen.repository;

import com.liuwen.entity.Student;

/**
 * @author: Liu Wen
 * @create: 2020-02-23 13:28
 * @description: Good good study,day day up!
 **/
public interface StudentRepository {
    public Student findById(long id);
}
