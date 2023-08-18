package com.pxp.spring.cloud.kubernetes.thaug2023clientapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Value("${greeting.message}")
    private String message;

    @RequestMapping(value = "message", method = RequestMethod.GET)
    public String getMessage() {
        return message;
    }
}
