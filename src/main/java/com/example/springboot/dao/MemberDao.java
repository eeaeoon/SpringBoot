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
        resultObject.put("MEMBER_ID", "12349301202");
        resultObject.put("NAME", "name 99");
        return resultObject;
    }

    public Object getList(Object dataMap) {
        List<Object> resultList = new ArrayList<Object>();
        Map<String, Object> data01 = new HashMap<String, Object>();
        data01.put("NAME", "name 01");
        data01.put("MEMBER_ID", "490293232849");
        resultList.add(data01);
        Map<String, Object> data02 = new HashMap<String, Object>();
        data02.put("NAME", "name 02");
        data02.put("MEMBER_ID", "29342342849");
        resultList.add(data02);
        Map<String, Object> data03 = new HashMap<String, Object>();
        data03.put("NAME", "name 03");
        data03.put("MEMBER_ID", "39123212849");
        resultList.add(data03);

        return resultList;
    }
}