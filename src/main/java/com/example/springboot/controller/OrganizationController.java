package com.example.springboot.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.example.springboot.service.OrganizationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/organization")
public class OrganizationController {
    @Autowired
    private OrganizationService service;

    @RequestMapping(value = "/{action}")
    public ModelAndView action(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelandView) {
        String viewName = "/organization/";
        List<Object> resultList = new ArrayList<Object>();
        Object resultMap = new Object();

        if ("data".equals(action)) {
            viewName = viewName + action;
            if (paramMap.get("ORGANIZATION_SEQ") != null && paramMap.get("NAME") != null)
                service.putObject(paramMap);

            resultMap = service.getObject(paramMap);
        }

        modelandView.addObject("resultMap", resultMap);
        modelandView.setViewName(viewName);
        return modelandView;
    }
}