package com.example.springboot.service;

import com.example.springboot.dao.OrganizationDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService {
    @Autowired
    private OrganizationDao dao;

    public Object getObject(Object dataMap) {
        String sqlMapid = "organization.list";
        Object resultObject = dao.getList(sqlMapid, dataMap);
        return resultObject;
    }

    public Object putObject(Object dataMap) {
        Object resultObject = null;
        dao.insertList(dataMap);
        return resultObject;
    }
}