package com.liuwen.entity;

import lombok.Data;

import java.util.List;

/**
 * @author: Liu Wen
 * @create: 2020-02-23 13:44
 * @description: Good good study,day day up!
 **/
@Data
public class Customer {
    private long id;
    private String name;
    private List<Goods> goods;
}
