package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/member")
public class MemberController {
    @RequestMapping(value = { "/edit", "/view", "/list" },

            method = { RequestMethod.GET, RequestMethod.POST })

    public void actionMethod() {
    }
}