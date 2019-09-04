package cn.garbage.dao;

import cn.garbage.pojo.Account;

import java.util.List;
//@Repository
public interface AccountDao {
    //查询所有数据
   // @Select(value = "select *  from  account")
    public List<Account> selectfindAll();
    //添加数据
    //@Insert(value = "insert into account (name,money) values(#{name},#{money})")
    public  void insertAccount(Account account);
}
