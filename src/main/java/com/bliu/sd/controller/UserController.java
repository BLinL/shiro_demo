package com.bliu.sd.controller;

import com.bliu.sd.entity.User;
import com.bliu.sd.service.UserService;
import com.bliu.sd.utils.SHAHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/save")
    public ModelAndView addUser(@ModelAttribute(value = "user") User user){
        System.out.println(user);
        user.setPassword(SHAHelper.encrypt(user.getPassword()));// 加密
        userService.addUser(user);
        ModelAndView mv = new ModelAndView("login");
        mv.addObject("user",new User());
        return mv;
    }

    //init default user
    @RequestMapping(value = "/add")
    public ModelAndView showUser(Model model){
        model.addAttribute("user",new User());
        ModelAndView mv = new ModelAndView("register");
        return mv;
    }
}
