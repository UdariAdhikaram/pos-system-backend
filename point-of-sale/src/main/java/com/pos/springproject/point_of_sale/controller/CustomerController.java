package com.pos.springproject.point_of_sale.controller;

import com.pos.springproject.point_of_sale.dto.CustomerDTO;
import com.pos.springproject.point_of_sale.dto.request.CustomerSaveRequestDTO;
import com.pos.springproject.point_of_sale.dto.request.CustomerUpdateRequestDTO;
import com.pos.springproject.point_of_sale.service.CustomerService;
import com.pos.springproject.point_of_sale.service.impl.CustomerServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(path = "/save")
    public String saveCustomer(@RequestBody CustomerSaveRequestDTO customerSaveRequestDTO){
        String id = customerService.addCustomer(customerSaveRequestDTO);
        return id;
    }

    @PutMapping(path = "/update")
    public String updateCustomer(@RequestBody CustomerUpdateRequestDTO customerUpdateRequestDTO){
        String updated = customerService.updateCustomer(customerUpdateRequestDTO);
        return updated;
    }
}
