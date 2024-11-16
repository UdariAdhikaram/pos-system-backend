package com.pos.springproject.point_of_sale.dto.request;

import lombok.*;

import java.util.ArrayList;

/**
 * @author : A.S.M.M.U.P.Adhikaram
 * @Since : 11/15/2024
 * @Time : 11:55 PM
 **/

@AllArgsConstructor
@NoArgsConstructor
//@Getter
//@Setter
//@ToString
@Data
public class CustomerUpdateRequestDTO {

    private int customerId;
    private String customerName;
    private String customerAddress;
    private double customerSalary;
    private ArrayList contactNumbers;
    private String nic;
    private boolean activeState;
}
