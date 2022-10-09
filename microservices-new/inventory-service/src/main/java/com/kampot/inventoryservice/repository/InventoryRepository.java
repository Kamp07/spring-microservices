package com.kampot.inventoryservice.repository;

import com.kampot.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * todo Document type InventoryRepository
 */
@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
        List<Inventory> findBySkuCodeIn(List<String> skuCode);
}
