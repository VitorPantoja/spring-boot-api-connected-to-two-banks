package com.leaddell.emotionreportapi.repository.product;

import com.leaddell.emotionreportapi.model.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> { }
