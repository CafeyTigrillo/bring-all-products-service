package com.mipagina.bring_all_products_service.controller;

import com.mipagina.bring_all_products_service.model.Product;
import com.mipagina.bring_all_products_service.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/products/bring-all")
    public List<Product> bringAllProducts(){
        return productService.bringAllProducts();
    }
}
