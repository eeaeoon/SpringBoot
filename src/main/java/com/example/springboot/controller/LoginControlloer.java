package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginControlloer {
    @RequestMapping(value = "/Login/Login")
    public void loginAction() {
    }

    @RequestMapping(value = "/Login/Logout")
    public void logoutAction() {
    }

    @RequestMapping(value = "/Login/Signin")
    public void SigninAction() {

    }
}