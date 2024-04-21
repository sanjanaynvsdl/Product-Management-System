package com.example.productservicedb.Service;

import com.example.productservicedb.Models.Product;

public interface ProductInterface {

    Product getProductById(Long id);
    Product createProduct(Product product);
}
