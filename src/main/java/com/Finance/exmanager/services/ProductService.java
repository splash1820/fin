package com.Finance.exmanager.services;

import java.util.List;

import com.Finance.exmanager.model.Product;

public interface ProductService {
  Product createProduct(Product product);
  Product getProduct(Long id);
  List<Product> getAllProducts();
  Product updateProduct(Long id, Product product);
  void deleteProduct(Long id);
}
