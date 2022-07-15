package com.example.feignclientexample.Consumes;

import com.example.feignclientexample.entities.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "customer-service",url = "localhost:8080/customer")
public interface CustomerConsume {
    @GetMapping("/all")
    public List<Customer> getAllCustomer();
    @GetMapping("/all/{id}")
    public Customer getCustomerById(@PathVariable long id);
    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer);
    @DeleteMapping("/delete/{id}")
    public HttpStatus deleteCustomer(@PathVariable long id);
    @GetMapping("/test")
    public String cacheControl() throws InterruptedException;
}
