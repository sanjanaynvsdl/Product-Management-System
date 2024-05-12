package com.example.productservicedb.ExceptionHandlers;

import com.example.productservicedb.CustomExceptions.ProductNotFoundExcep;
import com.example.productservicedb.DTOs.ExceptionDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ResourceBundle;

@ControllerAdvice
public class GlobaclExceptionHandler {
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<ExceptionDTO> handleArithematicException(){
        ExceptionDTO dto=new ExceptionDTO();
        dto.setMessage("Something went wrong");
        dto.setResolution("Arithematic Exception Occured");
        ResponseEntity<ExceptionDTO> response=new ResponseEntity<>(dto, HttpStatus.INTERNAL_SERVER_ERROR);
        return response;
    }
    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    public ResponseEntity<ExceptionDTO> handleArrayIndexOutOfBoundsException(){
        ExceptionDTO dto=new ExceptionDTO();
        dto.setMessage("Something went wrong");
        dto.setResolution("Array Index Out Of Bounds Exception Occured");
        ResponseEntity<ExceptionDTO> response=new ResponseEntity<>(dto, HttpStatus.INTERNAL_SERVER_ERROR);
        return response;
    }
    @ExceptionHandler(ProductNotFoundExcep.class)
    public ResponseEntity<ExceptionDTO> handleProductNotFound(ProductNotFoundExcep ex) {
        {
            ExceptionDTO dto = new ExceptionDTO();
            dto.setMessage("Invaid product id+ ProductNotFoundExcep.getId() +passed");
            dto.setResolution("Please provide a valid product id");
            ResponseEntity<ExceptionDTO> response = new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
            return response;

        }
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<ExceptionDTO> handleException(){
//        ExceptionDTO dto=new ExceptionDTO();
//        dto.setMessage("Something went wrong");
//        dto.setResolution("Exception Occured");
//        ResponseEntity<ExceptionDTO> response=new ResponseEntity<>(dto, HttpStatus.INTERNAL_SERVER_ERROR);
//        return response;
//    }

        //All these are very common exceptions
        //We can also create our own exceptions custom exceptions
        /* Scenario : if user passes invalid id then it is not caught in this , so in these cases we use custom exception
         * handler than directly using the Exception class to make it more specific */

        //To replace all this in controller we use differnt package
    /*public  ResponseEntity  getProductById(@PathVariable("id") Long id) {
        //public Product getProductById( --> first)
        //return ProductInterfacee.getProductById(id); (first class)
        //ResponseEntity() when we get response we also get status code and headers So we use ResponseEntity to store!
        //Throwing exception from controller
        //throw new RuntimeException("Something went wrong"); type-1
        //Exception from directly controller is not a good practice because it shows data to the user
        //Instead of directly returning this we use try and catch to handle the exception.
        //Try, catch error : //shows HTTP ERROR 404 in this case we are not exposing anything to client we are just showing a message to the client
        //Create a ResponseEntity object and return it
        //If there is no exception it will create a product and return it.
        //Even if there is an exception it will return an object but, not the product object.
        //By using Exception DTO, creates an object in catch and return the required message to the client.
        //we can only return product so, we will come to ExceptionDTO later but without mentioning ResponseEntity<Product> in return type we can also return message to the client.
        ResponseEntity<Product> responseEntity=null;
        Product prd=null;
        try{
            prd= ProductInterfacee.getProductById(id);
            responseEntity=new ResponseEntity<Product>(prd, HttpStatus.OK);
            System.out.println("Product is: ");
        } catch(RuntimeException exception) {
            //responseEntity=new ResponseEntity(HttpStatus.NOT_FOUND); (without message);
            ExceptionDTO dto=new ExceptionDTO();
            dto.setMessage("Product not found");
            dto.setResolution("Please try again later");

            ResponseEntity<ExceptionDTO> response=new ResponseEntity<>(dto,HttpStatus.NOT_FOUND);
            return response;
        }
        return responseEntity;

     */
    }
}
