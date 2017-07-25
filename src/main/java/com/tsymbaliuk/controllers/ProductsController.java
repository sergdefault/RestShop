package com.tsymbaliuk.controllers;

/**
 * Created by SerhiiTsymbaliuk on 7/13/17.
 */
import com.tsymbaliuk.entity.Category;
import com.tsymbaliuk.entity.Product;
import com.tsymbaliuk.services.CategoriesService;
import com.tsymbaliuk.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


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

}