package com.example.springboot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.springboot.service.MemberService;
import com.example.springboot.service.MemberService2;

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
    private MemberService service1;
    @Autowired
    private MemberService2 service2;

    @RequestMapping(value = "/{action}")
    public ModelAndView action(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelandView) {
        String viewName = "/member/";
        Map<String, Object> resultMap = new HashMap<String, Object>();
        List<Object> resultList = new ArrayList<Object>();
        if ("read".equals(action)) {
            viewName = viewName + action;
            resultMap = (Map<String, Object>) service1.getObject(paramMap);
            resultList = (List<Object>) service2.getList(paramMap);
        }
        modelandView.addObject("resultMap", resultMap);
        modelandView.addObject("resultList", resultList);
        modelandView.setViewName(viewName);
        return modelandView;
    }
}