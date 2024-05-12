package com.example.productservicedb.Controllers;


import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.productservicedb.DTOs.ExceptionDTO;
import com.example.productservicedb.Models.Product;
import com.example.productservicedb.Service.ProductInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductInterface ProductInterfacee;
    //Dependency Injection
    ProductController(@Qualifier("SelfProductSerivce") ProductInterface fakeStoreProductService){
        this.ProductInterfacee = fakeStoreProductService;
    }
    @GetMapping("/{id}")
    public  Product  getProductById(@PathVariable("id") Long id) {
        return ProductInterfacee.getProductById(id);
    }
    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return ProductInterfacee.createProduct(product);
    }
    //We can pass id, but we cannot pass complete object so, for that we use  @RequestBody
    //For this post mapping whatever object we pass map it with Product object done by @RequestBody
    //what-ever we are passing in the body of the request map it with the product object

}
