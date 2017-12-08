package com.tsymbaliuk.dao;

import com.tsymbaliuk.entity.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by SerhiiTsymbaliuk on 12/8/17.
 */

public interface OrderDao extends CrudRepository<Order, Long> {
    public List<Order> findByUserId(long id);
}
