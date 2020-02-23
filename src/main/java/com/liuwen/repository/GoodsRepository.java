package com.liuwen.repository;

import com.liuwen.entity.Goods;

public interface GoodsRepository {
    public Goods findById(long id);
}
