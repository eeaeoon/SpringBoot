package com.example.springboot.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {
    public Object getObject(Object dataMap) {
        Map<String, Object> resultObject = new HashMap<String, Object>();
        resultObject.put("MEMBER_ID", "asdf");
        resultObject.put("NAME", "ASDF");
        return resultObject;
    }

    public Object getList(Object dataMap) {
        List<Object> resultList = new ArrayList<Object>();
        Map<String, Object> data01 = new HashMap<String, Object>();
        data01.put("NAME", "NAME1");
        data01.put("MEMBER_ID", "123");
        resultList.add(data01);
        Map<String, Object> data02 = new HashMap<String, Object>();
        data02.put("NAME", "NAME2");
        data02.put("MEMBER_ID", "456");
        resultList.add(data02);
        Map<String, Object> data03 = new HashMap<String, Object>();
        data03.put("NAME", "NAME3");
        data03.put("MEMBER_ID", "789");
        resultList.add(data03);

        return resultList;
    }
}