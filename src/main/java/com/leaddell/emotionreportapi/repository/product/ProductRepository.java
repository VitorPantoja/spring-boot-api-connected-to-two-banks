package com.leaddell.emotionreportapi.repository.product;

import com.leaddell.emotionreportapi.model.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> { }
