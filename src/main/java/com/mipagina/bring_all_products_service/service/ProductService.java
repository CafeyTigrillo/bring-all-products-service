package com.mipagina.bring_all_products_service.service;

import com.mipagina.bring_all_products_service.model.Product;
import com.mipagina.bring_all_products_service.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{

    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> bringAllProducts() {
        return productRepository.findAll();
    }
}
