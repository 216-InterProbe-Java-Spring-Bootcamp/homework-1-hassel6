package com.example.odev1hassel6.dao;

import com.example.odev1hassel6.ents.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Long > {
}
