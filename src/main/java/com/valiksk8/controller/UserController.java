package com.valiksk8.controller;

import com.valiksk8.model.User;
import com.valiksk8.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView vm = new ModelAndView();
        vm.setViewName("login");
        vm.addObject("user", new User());
        return vm;
    }

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute(name = "user") User user) {
        ModelAndView vm = new ModelAndView();
        userService.getUserByEmail(user.getEmail());
        vm.setViewName("login");
        vm.addObject("user", new User());
        return vm;
    }
}
