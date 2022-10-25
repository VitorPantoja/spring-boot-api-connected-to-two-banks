package com.leaddell.emotionreportapi.service;

import com.leaddell.emotionreportapi.model.product.Product;
import com.leaddell.emotionreportapi.repository.product.ProductRepository;
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
