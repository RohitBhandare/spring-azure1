package com.azure.SpringAzure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @RequestMapping("/hello")
    public  String hello()
    {
        return "Welcome to my first spring application";
    }

}
