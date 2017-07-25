package com.tsymbaliuk.entity;

import javax.persistence.Table;
import java.util.Set;

/**
 * Created by SerhiiTsymbaliuk on 7/25/17.
 */
@Table(name="orders")
public class Order {
    private long id;
    private Set<Product> products;
    private double totalPrice;
}
