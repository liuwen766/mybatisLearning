package com.liuwen.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Liu Wen
 * @create: 2020-02-23 11:38
 * @description: Good good study,day day up!
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private int id;
    private String username;
    private String password;
    private int age;
}
