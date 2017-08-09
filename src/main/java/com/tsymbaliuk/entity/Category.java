package com.tsymbaliuk.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by SerhiiTsymbaliuk on 7/14/17.
 */
@Entity(name = "categories")
public class Category implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="category_id")
    private long category_id;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Basic(fetch=FetchType.LAZY)
    @OneToMany(mappedBy = "category")
    protected Set<Product> products;


    public Category(){}


    public long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(long category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}