package com.example.productservicedb.Models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private Double price;
    @ManyToOne //Refer cardinality many products are mapped to one category so use many to one
    //All these annotations are used from  jakarta.persistence package we added in pom.xml
    private Category category;
    private String image;
}
