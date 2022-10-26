package com.multipledb.api.model.product;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "public")
@Data
public class Product {

    @Id
    private int id;

    private String name;

    private double price;
}