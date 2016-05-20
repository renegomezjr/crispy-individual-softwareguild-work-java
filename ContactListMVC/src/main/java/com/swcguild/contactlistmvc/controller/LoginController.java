package com.swcguild.contactlistmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    // #1 - respond to all GET requests for /login

    @RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
    public String showLoginForm() {
        return "login";
    }
}
