package com.tsymbaliuk.controllers;

import com.tsymbaliuk.entity.Category;
import com.tsymbaliuk.services.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by SerhiiTsymbaliuk on 7/16/17.
 */
@RestController
@CrossOrigin()
@RequestMapping(value = "/categories")
public class CategoriesController {

    @Autowired
    private CategoriesService categoriesService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Collection<Category> categories() {
        return categoriesService.getAll();
    }
}
