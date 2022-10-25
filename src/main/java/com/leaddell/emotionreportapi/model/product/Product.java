package com.leaddell.emotionreportapi.model.product;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "products")
public class Product {

    @Id
    private int id;

    private String name;

    private double price;
}