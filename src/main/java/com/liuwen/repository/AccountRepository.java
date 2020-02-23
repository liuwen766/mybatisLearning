package com.liuwen.repository;

import com.liuwen.entity.Account;

import java.util.List;

/**
 * @Description:   通过mapper代理实现自定义接口
  * @param
 * @return
 * @date 20.2.23 13:10
 */
public interface AccountRepository {
    public int save(Account account);
    public int update(Account account);
    public int deleteById(long id);
    public List<Account> findAll();
    public Account findById(long id);
    public Account findByAccount(Account account);
}
