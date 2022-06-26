package com.example.odev1hassel6.dao;

import com.example.odev1hassel6.ents.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer, Long> {
}
