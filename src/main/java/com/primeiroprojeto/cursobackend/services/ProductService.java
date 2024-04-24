package com.primeiroprojeto.cursobackend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.primeiroprojeto.cursobackend.model.Product;
import com.primeiroprojeto.cursobackend.repository.ProductRepository;

@Service
public class ProductService {
    
    
    @Autowired
    private ProductRepository  productRepository;


    /**
     * Method that return a list of products
     * @return Lista de products
     */
    public List<Product> findAll(){

        //if exist a business rule, it will be put here

        return productRepository.findAll();

    }

        /**
     * Method to find a product by Id
     * @param id Id of the product that will be searched
     * @return Return a product if exists
     */
    public Optional<Product> findById(Integer id){

        return productRepository.findById(id);

    }


    /**
     * Method to add a product
     * @param product product that will be added in the list
     * @return Return a product if he was put in the list
     */
    
     public Product save(Product product){
        
        //if exist a business rule, it will be put here.
        //Example: a condition to not accept productes with negative quantities or 

        return productRepository.save(product);

    }

    /**
     * Metohod to delete a product
     * @param id Id of the product that will be deleted
     */
    public void delete(Integer id){

        //Here could be created a validation to find if the product really exists

        productRepository.deleteById(id);

    }


    /**
     * Method to update a product
     * @param product product that will be update
     * @return Return a product if he was put in the list
     */
    public Product update(Integer id, Product product){

        return productRepository.save(product);

    }

    

}
