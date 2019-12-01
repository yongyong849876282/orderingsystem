package com.southwind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index {

    @RequestMapping(value = {"/index","/login"})
    public String index(){
        return "login";
    }
}
