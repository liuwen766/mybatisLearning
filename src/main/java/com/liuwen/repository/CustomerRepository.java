package com.liuwen.repository;

import com.liuwen.entity.Customer;

public interface CustomerRepository {
    public Customer findById(long id);
}
