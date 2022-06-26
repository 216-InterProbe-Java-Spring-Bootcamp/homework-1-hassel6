package com.example.odev1hassel6.service;

import com.example.odev1hassel6.dao.CustomerDao;
import com.example.odev1hassel6.ents.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerEntityService {
    private final CustomerDao customerDao;

    public List<Customer> findAll(){
        return customerDao.findAll();
    }

    public Optional<Customer> findById(Long id){
        return customerDao.findById(id);
    }

    public Customer save(Customer customer){
        return customerDao.save(customer);
    }

}
