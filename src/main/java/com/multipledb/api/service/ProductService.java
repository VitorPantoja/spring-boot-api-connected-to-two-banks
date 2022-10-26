package com.multipledb.api.service;

import com.multipledb.api.model.product.Product;
import com.multipledb.api.repository.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository deptRepo;

    public List getAllDepartment() {
        return (List) deptRepo.findAll();
    }

    public Product saveDepartment(Product dept) {
        return deptRepo.save(dept);
    }
}
