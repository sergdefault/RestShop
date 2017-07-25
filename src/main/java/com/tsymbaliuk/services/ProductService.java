package com.tsymbaliuk.services;

import com.tsymbaliuk.dao.ProductsDao;
import com.tsymbaliuk.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by SerhiiTsymbaliuk on 7/14/17.
 */
@Service
public class ProductService {
    @Autowired
    private ProductsDao productsDao;

    public Collection<Product> getProducts(){
        return this.productsDao.findAll();
    }

    public Product getById(long id){
        return productsDao.findOne(id);
    }
}
