package com.tsymbaliuk.controllers;

/**
 * Created by SerhiiTsymbaliuk on 7/13/17.
 */
import com.tsymbaliuk.entity.Product;
import com.tsymbaliuk.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;


/**
 * Created by SerhiiTsymbaliuk on 7/13/17.
 */

@RestController
@CrossOrigin()
@RequestMapping(value = "/products")
public class ProductsController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody  Collection<Product> products() {
        return productService.getProducts();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Product getById(@PathVariable ("id")long id){
        return productService.getById(id);
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<List<Product>> getById(@RequestBody List<Product> products){
        products.forEach(System.out::println);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}