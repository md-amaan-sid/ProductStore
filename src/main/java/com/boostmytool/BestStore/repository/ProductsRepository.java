package com.boostmytool.BestStore.repository;

import com.boostmytool.BestStore.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
