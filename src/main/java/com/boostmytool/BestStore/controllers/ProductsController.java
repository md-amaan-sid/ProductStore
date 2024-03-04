package com.boostmytool.BestStore.controllers;

import com.boostmytool.BestStore.entities.Product;
import com.boostmytool.BestStore.models.ProductDTO;
import com.boostmytool.BestStore.repository.ProductsRepository;

import com.boostmytool.BestStore.services.ProductsService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductsController {
    @Autowired
    private ProductsRepository repo;
    @Autowired
    private ProductsService productsService;

    @GetMapping
    public String showProductList(@NotNull Model model) {
        List<Product> products = repo.findAll(Sort.by(Sort.Direction.DESC, "id"));
        model.addAttribute("products", products);
        return "products/index";
    }
    @PostMapping
    public String createProductList(@RequestBody ProductDTO productDTO){
        productsService.createProduct(productDTO);
        return "ok";
    }

}
