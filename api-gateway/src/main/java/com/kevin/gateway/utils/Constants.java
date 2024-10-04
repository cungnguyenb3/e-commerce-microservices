package com.kevin.gateway.utils;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Constants {

    @Getter
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    public enum RouteCommon {
        FALLBACK_ROUTE("fallbackRoute"),
        FALLBACK_PATH("/fallbackRoute"),
        FORWARD_FALLBACK("forward:/fallbackRoute"),
        API_DOCS("/api-docs");

        private final String value;
    }

    @Getter
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    public enum ProductService {
        HOST("http://localhost:8080"),
        ROUTE_ID("product_service"),
        PATH("/api/product"),
        CIRCUIT_BREAKER_ID("productServiceCircuitBreaker"),

        ROUTE_SWAGGER_ID("product_service_swagger"),
        PATH_SWAGGER("/aggregate/product-service/v3/api-docs"),
        CIRCUIT_BREAKER_SWAGGER_ID("productServiceSwaggerCircuitBreaker");

        private final String value;
    }

    @Getter
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    public enum OrderService {
        HOST("http://localhost:8081"),
        ROUTE_ID("order_service"),
        PATH("/api/order"),
        CIRCUIT_BREAKER_ID("orderServiceCircuitBreaker"),

        ROUTE_SWAGGER_ID("order_service_swagger"),
        PATH_SWAGGER("/aggregate/order-service/v3/api-docs"),
        CIRCUIT_BREAKER_SWAGGER_ID("orderServiceSwaggerCircuitBreaker");

        private final String value;
    }

    @Getter
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    public enum InventoryService {
        HOST("http://localhost:8082"),
        ROUTE_ID("inventory_service"),
        PATH("/api/inventory"),
        CIRCUIT_BREAKER_ID("inventoryServiceCircuitBreaker"),

        ROUTE_SWAGGER_ID("inventory_service_swagger"),
        PATH_SWAGGER("/aggregate/inventory-service/v3/api-docs"),
        CIRCUIT_BREAKER_SWAGGER_ID("inventoryServiceSwaggerCircuitBreaker");

        private final String value;
    }
}
