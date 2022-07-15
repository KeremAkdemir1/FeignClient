package com.example.feignclientexample;

import com.example.feignclientexample.Consumes.CustomerConsume;
import com.example.feignclientexample.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    CustomerConsume customerConsume;

    @GetMapping("/allcustomer")
    public List<Customer> GetAllCustomer(){
        return customerConsume.getAllCustomer();
    }
    @GetMapping("/allcustomer/{id}")
    public Customer getCustomerById(@PathVariable long id){
        return customerConsume.getCustomerById(id);
    }
    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer){
        return customerConsume.createCustomer(customer);
    }

}
