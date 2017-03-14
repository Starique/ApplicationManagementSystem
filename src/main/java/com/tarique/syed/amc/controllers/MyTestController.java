package com.tarique.syed.amc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tariquedev on 3/14/17.
 */

@Controller
public class MyTestController {
    @RequestMapping("/")
    public String testController() {
        return "mytest";
    }
}
