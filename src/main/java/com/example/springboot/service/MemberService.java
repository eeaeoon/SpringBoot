package com.example.springboot.service;

import com.example.springboot.dao.MemberDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    private MemberDao dao;

    public Object getObject(Object dataMap) {
        Object resultObject = dao.getObject(dataMap);
        return resultObject;
    }
}