package com.tsymbaliuk.dao;

import com.tsymbaliuk.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * Created by SerhiiTsymbaliuk on 7/14/17.
 */

public interface ProductsDao extends JpaRepository<Product,Long>{
}
