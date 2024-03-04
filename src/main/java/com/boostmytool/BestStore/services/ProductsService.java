package com.boostmytool.BestStore.services;

import com.boostmytool.BestStore.entities.Product;
import com.boostmytool.BestStore.models.ProductDTO;
import com.boostmytool.BestStore.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ProductsService {
    @Autowired
    private ProductsRepository repo;

    public Product createProduct(ProductDTO productDTO) {
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setBrand(productDTO.getBrand());
        product.setCategory(productDTO.getCategory());
        product.setDescription(productDTO.getDescription());
        product.setPrice(productDTO.getPrice());
      //  product.setImageFileName(productDTO.getImageFileName());
        product.setCreatedAt(new Date());
        repo.save(product);
        return product;

    }



}
