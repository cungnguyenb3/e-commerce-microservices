package com.kevin.microservices.inventory.service;

import com.kevin.microservices.product.event.InventoryUpdatedEvent;
import com.kevin.microservices.inventory.model.Inventory;
import com.kevin.microservices.inventory.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    public boolean isInStock(String skuCode, Integer quantity) {
        return inventoryRepository.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode, quantity);
    }

    @KafkaListener(topics = "inventory-update")
    private void listenCreateOrUpdateInventory(InventoryUpdatedEvent inventoryUpdatedEvent) {
        if (inventoryUpdatedEvent == null
                || inventoryUpdatedEvent.getSkuCode() == null
                || inventoryUpdatedEvent.getQuantity() == null) {
            return;
        }

        Inventory inventory = inventoryRepository.findBySkuCode(inventoryUpdatedEvent.getSkuCode().toString()).orElse(null);
        if (inventory == null) {
            inventory = new Inventory();
        }

        inventory.setSkuCode(inventoryUpdatedEvent.getSkuCode().toString());
        inventory.setQuantity(Integer.parseInt(inventoryUpdatedEvent.getQuantity().toString()));
        inventoryRepository.save(inventory);
    }
}
