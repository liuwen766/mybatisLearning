package com.liuwen.entity;

import lombok.Data;

import java.util.List;

/**
 * @author: Liu Wen
 * @create: 2020-02-23 13:21
 * @description: Good good study,day day up!
 **/
@Data
public class Classes {
    private long id;
    private String name;
    private List<Student> students;
}
