package com.vg.docker_kubernetes.service;


import com.vg.docker_kubernetes.model.Product;

import java.util.List;

public interface ProductService {
    Product save(Product product);

    List<Product> findAll();

    Product findById(Long id);
}
