package com.tsymbaliuk.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by SerhiiTsymbaliuk on 12/8/17.
 */
@Entity()
@Table(name="items")
public class OrderItem {
    @Id
    @Column(name = "ITEM_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_seq")
    @SequenceGenerator(name = "item_seq", sequenceName = "item_seq", allocationSize = 1)
    private Long itemId;

    @Column(name = "P_ID")
    @NotNull
    private long product_id;

    @Column(name = "O_ID")
    @NotNull
    private int orderId;


    @Column(name = "P_PRICE")
    @NotNull
    private double price;

    public OrderItem() {
    }


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
