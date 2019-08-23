package com.example.springboot.service;

import java.util.Map;

import com.example.springboot.model.Student;
import com.example.springboot.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public Object Add(Map<String, Object> dataMap) {
        Object resultObject = null;
        if (!dataMap.get("id").equals("") && !dataMap.get("name").equals("")
                && !dataMap.get("passportNumber").equals(""))
            repository.saveAndFlush(new Student(Long.parseLong((String) dataMap.get("id")),
                    (String) dataMap.get("name"), (String) dataMap.get("passportNumber")));
        return resultObject;
    }

    public Object getAll() {
        Object resultObject = repository.findAll(); // search

        return resultObject;
    }

    public Object getSearch(Map<String, Object> dataMap) {
        Object resultObject;
        if (dataMap.get("search") == null) {
            resultObject = repository.findAll(); // search
        } else
            resultObject = repository.getOne(Long.parseLong((String) dataMap.get("search")));

        return resultObject;
    }
}