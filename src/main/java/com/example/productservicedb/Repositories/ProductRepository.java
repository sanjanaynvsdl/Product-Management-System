package com.example.productservicedb.Repositories;

import com.example.productservicedb.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//To use the functionalities of JPA here we are extending JpaRepository(interface)
//This accepts two input parameters Model we are working with and the type of primary key
//The methods we use here are executed on this model

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    //To avoid null pointer exception we use Optional
    //It will go to database go to product table search for the product with this id.
    //We are  not implementing this method hibernate does it for us.
    @Override
    Optional<Product> findById(Long id);
    @Override
    Product save(Product product);


}
