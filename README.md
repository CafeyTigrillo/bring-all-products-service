# Bring All Products Service

## 🚀 Overview

The **Bring All Products Service** is a powerful and easy-to-use API designed to retrieve a complete list of products from the database. With just one simple endpoint, you can access detailed product information, including their name, description, price, availability, and category.

This service is built with **Spring Boot** and uses **JPA** for smooth database interaction. It's the perfect solution for e-commerce platforms or inventory systems that need a quick way to retrieve and manage their product catalogs.

## 🌟 Key Features

- **RESTful API**: A single endpoint to bring all products stored in the database.
- **JPA Integration**: Uses Java Persistence API to fetch and manage products.
- **Product Details**: Provides comprehensive product data, including name, description, price, category ID, and availability.

## 🔑 API Endpoint

- **GET** `/products/bring-all`:  
  Retrieves all products from the database in JSON format.

  **Response Example**:
  ```json
  [
    {
      "id_product": 1,
      "name": "Product Name",
      "description": "Product description goes here",
      "price": 19.99,
      "id_category": 2,
      "availability": true
    },
    {
      "id_product": 2,
      "name": "Another Product",
      "description": "Description of another product",
      "price": 39.99,
      "id_category": 1,
      "availability": false
    }
  ]

### 🔧 Technologies Used

 - Spring Boot for building the application.
 - JPA (Java Persistence API) for seamless database integration.
 - H2 Database (or any relational database) to store product data.
 - Java to tie everything together.
