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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


/**
 * Created by SerhiiTsymbaliuk on 7/13/17.
 */

@RestController
public class IndexController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoriesService categoriesService;


    @RequestMapping(value = "/products")
    public @ResponseBody Collection<Product> products() {
        return productService.getProducts();
    }

    @RequestMapping(value = "/cat")
    public Collection<Category> categories() {
        return categoriesService.getAll();
    }

}