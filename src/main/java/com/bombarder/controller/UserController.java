package com.bombarder.controller;

import com.bombarder.entity.User;
import com.bombarder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(path = "/user", method = RequestMethod.GET)
    public String findOneCustomer(@RequestParam long id, Model model) {
        model.addAttribute("user", userService.findById(id));
        return "user/one";
    }

    @RequestMapping(path = "/user/all", method = RequestMethod.GET)
    public String findAllCustomers(Model model) {
        model.addAttribute("users", userService.findAll());
        return "user/many";
    }

    @RequestMapping(path = "/user/add", method = RequestMethod.POST)
    public String saveCustomer(User user) {
        userService.create(user);
        return "redirect:/user/all";
    }
}
