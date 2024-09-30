package com.kevin.microservices.product.service;

import com.kevin.microservices.product.dto.ProductRequest;
import com.kevin.microservices.product.dto.ProductResponse;
import com.kevin.microservices.product.model.Product;
import com.kevin.microservices.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;

    public ProductResponse createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.name())
                .skuCode(productRequest.skuCode())
                .description(productRequest.description())
                .price(productRequest.price())
                .build();
        productRepository.save(product);
        log.info("Product created: {}", product);
        return new ProductResponse(product.getId(), product.getName(), product.getSkuCode(), product.getDescription(), product.getPrice());
    }

    public List<ProductResponse> getAllProducts() {
        return productRepository.findAll()
                .stream().map(product -> new ProductResponse(product.getId(), product.getName(), product.getSkuCode(), product.getDescription(), product.getPrice()))
                .toList();
    }
}
