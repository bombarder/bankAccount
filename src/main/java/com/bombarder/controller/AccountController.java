package com.bombarder.controller;

import com.bombarder.entity.Account;
import com.bombarder.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping(path ="/account", method = RequestMethod.GET)
    public String account (@RequestParam long id, Model model){
        model.addAttribute("account", accountService.findById(id));
        return "account/one";
    }
    @RequestMapping(path = "/account/all", method = RequestMethod.GET)
    public String findAllEntertainment(Model model) {
        model.addAttribute("someAccount", accountService.findAll());
        return "account/many";
    }
    @RequestMapping(path = "/account/add", method = RequestMethod.POST)
    public String saveEntertainment(Account account) {
        accountService.create(account);
        return "redirect:/account/all";
    }
}
