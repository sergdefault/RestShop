package com.tsymbaliuk.controllers;

import com.tsymbaliuk.entity.Category;
import com.tsymbaliuk.entity.CategoryBase;
import com.tsymbaliuk.services.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
    public List<CategoryBase> categoriesBaseInfo() {
        List<Object[]> baseInfoList = categoriesService.findBaseInfo();
        List<CategoryBase> result = new ArrayList<>();
        for(Object[] obj:baseInfoList){
            long id = (Integer)obj[0];
            String name =(String) obj[1];
            result.add(new CategoryBase(id,name));
        }
        return result;
    }

    @RequestMapping(path = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Category categoryById(@PathVariable long id) {
        return categoriesService.getCategoryById(id);
    }
}
