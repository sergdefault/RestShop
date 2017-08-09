package com.tsymbaliuk.dao;

import com.tsymbaliuk.entity.Category;
import com.tsymbaliuk.entity.CategoryBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

/**
 * Created by SerhiiTsymbaliuk on 7/14/17.
 */
public interface CategoriesDao extends JpaRepository<Category,Long> {
    public static final String GET_IDS = "SELECT category_id, name FROM categories";

    @Query(value = GET_IDS, nativeQuery = true)
    public List<Object[]> findBaseInfo();
}
