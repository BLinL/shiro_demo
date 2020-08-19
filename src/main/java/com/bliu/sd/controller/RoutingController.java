package com.bliu.sd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoutingController {

    @GetMapping("login")
    public String login() {
        return "login";
    }

    @GetMapping("user")
    public String user() {
        return "userList";
    }

    @GetMapping("role")
    public String role() {
        return "role";
    }
}
