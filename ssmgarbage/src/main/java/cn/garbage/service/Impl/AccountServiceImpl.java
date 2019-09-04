package cn.garbage.service.Impl;

import cn.garbage.dao.AccountDao;
import cn.garbage.pojo.Account;
import cn.garbage.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    public AccountDao accountDao;
    public List<Account> selectfindAll() {
        return accountDao.selectfindAll();
    }

    public void insertAccount(Account account) {
        accountDao.insertAccount(account);
    }
}
