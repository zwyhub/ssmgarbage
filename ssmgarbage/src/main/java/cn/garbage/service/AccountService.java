package cn.garbage.service;

import cn.garbage.pojo.Account;

import java.util.List;

public interface AccountService {
    //查询所有数据
    public List<Account> selectfindAll();
    //添加数据
    public  void insertAccount(Account account);

}
