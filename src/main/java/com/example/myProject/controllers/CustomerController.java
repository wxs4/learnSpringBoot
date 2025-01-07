package com.example.myProject.controllers;

import com.example.myProject.domain.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CustomerController {

    private List<Customer> customers = new ArrayList<>(Arrays.asList(
            new Customer(123, "William", "william1", "1234"),
            new Customer(234, "Samia", "duarte1", "1234"),
            new Customer(345, "Nacho", "Fierro1", "1234"),
            new Customer(456, "Zoe", "doll", "1234")
    ));

    @GetMapping("clientes")
    public List<Customer> getCustomers() {
        return customers;
    }
}
