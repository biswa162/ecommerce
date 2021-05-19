package com.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value = "/api")
public class LoginController {

    @GetMapping( value = "/hi")
    public @ResponseBody String fun(){
        return "Hello World";
    }
}
