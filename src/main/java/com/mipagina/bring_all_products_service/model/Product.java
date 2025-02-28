package com.mipagina.bring_all_products_service.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
@Schema(description = "Product representing a menu item in the restaurant")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique identifier for the product. Required for operations such as retrieval and updates.", example = "1")
    private Long id_product;

    @Schema(description = "Name of the product. Essential for product identification.", example = "Deluxe Burger")
    private String name;

    @Schema(description = "Description of the product detailing its ingredients or features.", example = "Gourmet burger with beef patty, cheese, and fresh vegetables")
    private String description;

    @Schema(description = "Price of the product in USD. Used for billing and display.", example = "15.99")
    private Double price;

    @Schema(description = "Category ID to which the product belongs. Important for filtering products.", example = "2")
    private Long id_category;

    @Schema(description = "Availability status of the product. Determines whether it can be ordered.", example = "true")
    private Boolean availability;

    public Long getId_product() {
        return id_product;
    }

    public void setId_product(Long id_product) {
        this.id_product = id_product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getId_category() {
        return id_category;
    }

    public void setId_category(Long id_category) {
        this.id_category = id_category;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public Product() {
    }

    public Product(Long id_product, String name, String description, Double price, Long id_category, Boolean availability) {
        this.id_product = id_product;
        this.name = name;
        this.description = description;
        this.price = price;
        this.id_category = id_category;
        this.availability = availability;
    }
}
