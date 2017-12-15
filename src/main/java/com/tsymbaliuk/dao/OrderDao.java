package com.tsymbaliuk.dao;

import com.tsymbaliuk.entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by SerhiiTsymbaliuk on 12/8/17.
 */

@Transactional
public interface OrderDao extends CrudRepository<Order, Long> {
    public List<Order> findByUserId(long id);
}
