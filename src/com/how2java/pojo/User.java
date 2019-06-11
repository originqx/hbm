package com.how2java.pojo;

import java.util.Set;

/**
 * @Author: QX
 * @Date: 2019/6/10 15:15
 * @Version 1.0
 */
public class User {
    private int id;
    private String name;
    Set<Product> products;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
