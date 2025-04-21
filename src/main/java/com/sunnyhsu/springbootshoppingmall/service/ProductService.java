package com.sunnyhsu.springbootshoppingmall.service;

import com.sunnyhsu.springbootshoppingmall.dto.ProductQueryParams;
import com.sunnyhsu.springbootshoppingmall.dto.ProductRequest;
import com.sunnyhsu.springbootshoppingmall.model.Product;

import java.util.List;

public interface ProductService {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}

