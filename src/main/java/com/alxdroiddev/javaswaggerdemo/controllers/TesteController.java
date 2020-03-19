package com.alxdroiddev.javaswaggerdemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;


@RestController
public class TesteController {

    @RequestMapping(value = "/teste", method = RequestMethod.GET)
    public String custom() {
        return "I am Running at " + (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")).format(new Date());
    }

}

