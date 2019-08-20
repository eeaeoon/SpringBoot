package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticeController {
    @RequestMapping(value = "/Notice/list")
    public void listAction() {
    }

    @RequestMapping(value = "/Notice/edit")
    public void editAction() {
    }

    @RequestMapping(value = "/Notice/view")
    public void viewAction() {

    }

    @RequestMapping(value = "/Notice/delete")
    public void deleteAction() {

    }
}