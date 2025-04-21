package com.sunnyhsu.springbootshoppingmall.dao;

import com.sunnyhsu.springbootshoppingmall.dto.ProductQueryParams;
import com.sunnyhsu.springbootshoppingmall.dto.ProductRequest;
import com.sunnyhsu.springbootshoppingmall.model.Product;

import java.util.List;

public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void updateStock(Integer productId, Integer stock);

    void deleteProductById(Integer productId);
}

