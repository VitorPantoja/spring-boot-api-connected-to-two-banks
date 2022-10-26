package com.multipledb.api.repository.product;

import com.multipledb.api.model.product.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> { }
