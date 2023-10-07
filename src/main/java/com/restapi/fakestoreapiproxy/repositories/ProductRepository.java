package com.restapi.fakestoreapiproxy.repositories;

import com.restapi.fakestoreapiproxy.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
