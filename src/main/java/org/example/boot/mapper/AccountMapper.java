package org.example.boot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.boot.bean.Account;

//声明mapper接口
@Mapper
public interface AccountMapper {
    public Account getAcct(Long id);
}
