package com.pjx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JekinsController {

    @GetMapping("/")
    public String get(){
        return "吉祥君的jekens";
    }
}
