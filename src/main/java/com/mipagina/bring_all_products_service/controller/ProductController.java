package com.mipagina.bring_all_products_service.controller;

import com.mipagina.bring_all_products_service.model.Product;
import com.mipagina.bring_all_products_service.service.IProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Product", description = "APIs related to product management")
public class ProductController {

    @Autowired
    private IProductService productService;

    @Operation(
            summary = "Get all products from the menu",
            description = "This endpoint retrieves all available products on the restaurant's menu",
            responses = {
                    @ApiResponse(description = "Products retrieved successfully", responseCode = "200"),
            }
    )
    @GetMapping("/products/bring-all")
    public List<Product> bringAllProducts(){
        return productService.bringAllProducts();
    }
}
