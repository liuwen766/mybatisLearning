package com.liuwen.repository;

import com.liuwen.entity.Classes;

/**
 * @author: Liu Wen
 * @create: 2020-02-23 13:30
 * @description: Good good study,day day up!
 **/
public interface ClassesRepository {
    public Classes findById(long id);
    public Classes findByIdLazy(long id);
}
