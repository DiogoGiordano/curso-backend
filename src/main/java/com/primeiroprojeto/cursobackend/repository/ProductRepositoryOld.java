package com.primeiroprojeto.cursobackend.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.primeiroprojeto.cursobackend.model.Product;
import com.primeiroprojeto.cursobackend.model.exception.ResourceNotFoundException;


@Repository
public class ProductRepositoryOld {


    private List<Product> products = new ArrayList<Product>();
    private Integer lastId = 0;

    /**
     * Method that return a list of products
     * @return Lista de products
     */
    public List<Product> getAll(){

        return products;

    }


    /**
     * Method to find a product by Id
     * @param id Id of the product that will be searched
     * @return Return a product if exists
     */
    public Optional<Product> getById(Integer id){

        return products.stream().filter(product -> product.getId() == id).findFirst();
    }
    

    /**
     * Method to add a product
     * @param product product that will be added in the list
     * @return Return a product if he was put in the list
     */
    
    public Product addproduct(Product product){

        lastId++;
        
        product.setId(lastId);
        products.add(product);

        return product;

    }

    /**
     * Metohod to delete a product
     * @param id Id of the product that will be deleted
     */
    public void delete(Integer id){

        products.removeIf(product -> product.getId() == id);

    }


    /**
     * Method to update a product
     * @param product product that will be update
     * @return Return a product if he was put in the list
     */
    public Product update(Product product){

        Optional<Product> productFinded = getById(product.getId());

        if(productFinded.isEmpty()){
            throw new ResourceNotFoundException ("product not found");
        }

        delete(product.getId());

        products.add(product);

        return product;

    }

}
