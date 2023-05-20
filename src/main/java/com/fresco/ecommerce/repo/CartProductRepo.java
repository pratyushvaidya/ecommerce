package com.fresco.ecommerce.repo;

import com.fresco.ecommerce.models.CartProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartProductRepo extends JpaRepository<CartProduct, Integer> {
}