package com.tsymbaliuk.services;

import com.tsymbaliuk.dao.CategoriesDao;
import com.tsymbaliuk.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

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

    public List<Object[]> findBaseInfo(){
        return  categoriesDao.findBaseInfo();
    }

    public Category getCategoryById(long id){
        return categoriesDao.findOne(id);
    }
}
