package com.tarique.syed.amc.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tariquedev on 3/14/17.
 */

@Controller
public class MyTestController {
    /* The Application Logger */
    private static final Logger LOG = LoggerFactory.getLogger(MyTestController.class);

    @RequestMapping("/")
    public String testController() {
        LOG.info("Returning from MyTestController::testController");
        return "mytest";
    }
}
