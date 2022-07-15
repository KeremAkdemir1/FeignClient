package com.example.feignclientexample.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@ToString
public class Customer {


    private Long Id;
    private String name;
    private String lastName;
}
