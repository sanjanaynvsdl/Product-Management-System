package com.example.productservicedb.CustomExceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//Extending Exception class will become checked exception
//So, extending RuntimeException class will become unchecked exceptionnot show any error in the cons
////So, when we use Run Time (in service if there is an exception) it will ole.
//for every exception we have to create a class
public class ProductNotFoundExcep  extends RuntimeException{
    private long id;
    public ProductNotFoundExcep(String message, Long id) {
        super(message);
        this.id=id;
        //refer service class(get product byId)
    }


}
