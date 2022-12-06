package org.example.boot.service;

import org.example.boot.bean.Account;
import org.example.boot.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//测试类,查询方法
@Service
public class AccountService {
    @Autowired
    AccountMapper accountMapper;

    public Account getAccById(Long id){
        return accountMapper.getAcct(id);
    }
}
