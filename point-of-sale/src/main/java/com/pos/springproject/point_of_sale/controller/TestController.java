package com.pos.springproject.point_of_sale.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/test")
@CrossOrigin
public class TestController {
 
    @GetMapping("/get-1")
    public String getMyText(){
        String myText="This in our first spring boot project"; //variable
        System.out.println(myText);
        return myText;
    }

    @GetMapping("/get-2")
    public void getMyText1(){
        String myText="This in our second spring boot project"; //variable
        System.out.println(myText);
    }
}
