package com.example.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import com.example.springboot.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/member")
public class MemberController {
    @Autowired
    private MemberService service;

    @RequestMapping(value = "/{action}")
    public ModelAndView action(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelandView) {
        String viewName = "/member/";
        Map<String, Object> resultMap = new HashMap<String, Object>();
        if ("read".equals(action)) {
            viewName = viewName + action;
            MemberService mService = new MemberService();
            resultMap = (Map<String, Object>) mService.getObject(paramMap);

        }
        modelandView.addObject("resultMap", resultMap);
        modelandView.setViewName(viewName);
        return modelandView;
    }
}