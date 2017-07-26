package com.tsymbaliuk.dao;

import com.tsymbaliuk.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

/**
 * Created by SerhiiTsymbaliuk on 7/14/17.
 */
public interface CategoriesDao extends JpaRepository<Category,Long> {

}
