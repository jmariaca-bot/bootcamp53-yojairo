package com.productmicroservice.product_microservice.dto;

import com.productmicroservice.product_microservice.models.Holder;
import com.productmicroservice.product_microservice.util.EnumTypeBankAccount;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BankAccountGetDto {
    private String id;
    private String number;
    private Date dateCreated;
    private Double balance;
    private Double commission;
    private Integer limit;
    private EnumTypeBankAccount type;
    private String customer;
    private List<Holder> holders;
}