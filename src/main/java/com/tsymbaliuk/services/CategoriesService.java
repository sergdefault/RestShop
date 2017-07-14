package com.tsymbaliuk.services;

import com.tsymbaliuk.dao.CategoriesDao;
import com.tsymbaliuk.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by SerhiiTsymbaliuk on 7/14/17.
 */
@Service
public class CategoriesService {

    @Autowired
    private CategoriesDao categoriesDao;

    public Collection<Category> getAll(){
        return categoriesDao.findAll();
    }
}
