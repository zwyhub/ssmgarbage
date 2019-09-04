package cn.garbage.controller;

import cn.garbage.pojo.Account;
import cn.garbage.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    public AccountService accountService;

    @RequestMapping("/selectfindAll")
    public String selectfindAll(Model model){
        List<Account> accounts = accountService.selectfindAll();
        model.addAttribute("accounts",accounts);
        return  "success";
    }



    @RequestMapping("/insertAccount")
    public void insertAccount(Account account, HttpServletRequest request, HttpServletResponse response)throws  Exception{

        accountService.insertAccount(account);
         response.sendRedirect("/account/selectfindAll");
    }

}
