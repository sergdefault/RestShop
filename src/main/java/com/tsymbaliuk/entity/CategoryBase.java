package com.tsymbaliuk.entity;

/**
 * Created by SerhiiTsymbaliuk on 7/26/17.
 */
public class CategoryBase {
    long id;
    String name;

    public CategoryBase(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
