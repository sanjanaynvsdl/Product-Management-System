package com.example.productservicedb.Service;

import com.example.productservicedb.CustomExceptions.ProductNotFoundExcep;
import com.example.productservicedb.DTOs.FsProductDTO;
import com.example.productservicedb.Models.Category;
import com.example.productservicedb.Models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service("FakeStoreService")
public  class FakeStoreService  implements ProductInterface{
    public Product getProductById(Long id) {
        RestTemplate restTemp = new RestTemplate();
        FsProductDTO fakeStoreFsProductDto =restTemp.getForObject("https://fakestoreapi.com/products/"+id, FsProductDTO.class);
        //convert FsProductDTO to Product
        if(fakeStoreFsProductDto == null){
            //return null;
            throw new ProductNotFoundExcep("Product not found with id : ",id);
        }

        Product product = new Product();
        product=convertDtoToProduct(fakeStoreFsProductDto);
        return product;
    }
    public Product createProduct(Product product) {
        return null;
    }
    private Product convertDtoToProduct(FsProductDTO fakeStoreFsProductDto){
        Product product = new Product();
        product.setId(fakeStoreFsProductDto.getId());
        product.setTitle(fakeStoreFsProductDto.getTitle());
        product.setDescription(fakeStoreFsProductDto.getDescription());
        product.setPrice(fakeStoreFsProductDto.getPrice());
        product.setImage(fakeStoreFsProductDto.getImage());
        Category category = new Category();
        category.setId(fakeStoreFsProductDto.getId());
        category.setDescription(fakeStoreFsProductDto.getCategory());
        category.setTitle(fakeStoreFsProductDto.getCategory());
        product.setCategory(category);
        return product;
    }
/*   public Product getProductById(Long id) {
        //Service exception handling(but not a good idea)
        //throw new RuntimeException("Something went wrong in service");
        int x=1/0; /*This line throws an excetion     t by Exception handlers, Arithematic exception */
}
