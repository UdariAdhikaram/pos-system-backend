package com.pos.springproject.point_of_sale.service;

import com.pos.springproject.point_of_sale.dto.CustomerDTO;
import com.pos.springproject.point_of_sale.dto.request.CustomerSaveRequestDTO;
import com.pos.springproject.point_of_sale.dto.request.CustomerUpdateRequestDTO;

public interface CustomerService {

    String addCustomer(CustomerSaveRequestDTO customerSaveRequestDTO);

    String updateCustomer(CustomerUpdateRequestDTO customerUpdateRequestDTO);
}
