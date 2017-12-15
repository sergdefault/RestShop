package com.tsymbaliuk.services;

import com.tsymbaliuk.dao.OrderDao;
import com.tsymbaliuk.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by SerhiiTsymbaliuk on 12/8/17.
 */
@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    public List<Order> getOrdersByUserId(long id){
        return orderDao.findByUserId(id);
    }

    public Order getOrdersById(long id){
        return orderDao.findOne(id);
    }

    public void saveOrder(Order order){
        orderDao.save(order);
    }
}
