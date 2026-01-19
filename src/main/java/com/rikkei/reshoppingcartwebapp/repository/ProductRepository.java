package com.rikkei.reshoppingcartwebapp.repository;

import com.rikkei.reshoppingcartwebapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
