package com.example.springboot.service;

import com.example.springboot.dao.MemberDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService2 {
    @Autowired
    private MemberDao dao;

    public Object getList(Object dataMap) {
        Object resultObject = dao.getList(dataMap);
        return resultObject;
    }
}