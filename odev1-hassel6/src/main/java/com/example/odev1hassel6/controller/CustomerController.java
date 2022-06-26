package com.example.odev1hassel6.controller;

import com.example.odev1hassel6.ents.Customer;
import com.example.odev1hassel6.service.CustomerEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@RequestMapping( "/customers" )
public class CustomerController {
    private final CustomerEntityService customerEntityService;

    @PostMapping
    public Customer save(@RequestBody Customer customer ) {
        return customerEntityService.save( customer );
    }

    @GetMapping
    public Customer List<Customer> findAll() {
        return customerEntityService.findAll();
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable Long id){
        Optional<Customer> customer = customerEntityService.findById(id);

        return customer.get();
    }
}
