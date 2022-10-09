package com.kampot.productservice.repository;

import com.kampot.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * todo Document type ProductRepository
 */

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}
