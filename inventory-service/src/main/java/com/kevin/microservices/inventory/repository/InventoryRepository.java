package com.kevin.microservices.inventory.repository;

import com.kevin.microservices.inventory.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    boolean existsBySkuCodeAndQuantityIsGreaterThanEqual(String skuCode, int quantity);
    Optional<Inventory> findBySkuCode(String skuCode);
}
