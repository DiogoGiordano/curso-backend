package com.primeiroprojeto.cursobackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primeiroprojeto.cursobackend.model.Product;
import com.primeiroprojeto.cursobackend.services.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> findAll (){
        return productService.findAll();
    }

    @PostMapping
    public Product save(@RequestBody Product product){
        return productService.save(product);
    }


    @GetMapping("/{id}")
    public Optional<Product> findById (@PathVariable Integer id){
        return productService.findById(id);
    }

    @DeleteMapping("/{id}")
    public String delete (@PathVariable Integer id){
        productService.delete(id);

        return "The product with id:" + id + " has been successfully deleted";
    }

    @PutMapping("/{id}")
    public Product att(@RequestBody Product product, @PathVariable Integer id){
        return productService.update(id, product);
    }


}
