package com.example.productservicedb.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//to convert the response from the fakestoreapi to a product object
        //why we need this class?
        //because the response from the fakestoreapi is different from the product object
        //we need to convert the response to a product object
//will the object will be returned in json?
//yes


public class FsProductDTO {
    private Long id;
    private String title;
    private String description;
    private Double price;
    private String category;
    private String image;
}
