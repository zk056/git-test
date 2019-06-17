package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

public interface AccountService {
    public void save(Account account);
    public List<Account> findAll();

}
