package com.primeiroprojeto.cursobackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojeto.cursobackend.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
     
}
