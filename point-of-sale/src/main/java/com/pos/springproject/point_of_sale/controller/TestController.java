package com.pos.springproject.point_of_sale.controller;

import com.pos.springproject.point_of_sale.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class TestController {

    @PostMapping(path = "/save")
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDTO){
        System.out.println("Hello" + customerDTO.getCustomerName());
        return null;
    }

//    @GetMapping("/get-1")
//    public String getMyText(){
//        String myText="This in our first spring boot project"; //variable
//        System.out.println(myText);
//        return myText;
//    }
//
//    @GetMapping("/get-2")
//    public void getMyText1(){
//        String myText="This in our second spring boot project"; //variable
//        System.out.println(myText);
//    }
}
