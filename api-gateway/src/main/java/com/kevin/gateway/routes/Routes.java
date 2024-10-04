package com.kevin.gateway.routes;

import org.springframework.cloud.gateway.server.mvc.filter.CircuitBreakerFilterFunctions;
import org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import java.net.URI;

import static com.kevin.gateway.utils.Constants.ProductService;
import static com.kevin.gateway.utils.Constants.OrderService;
import static com.kevin.gateway.utils.Constants.InventoryService;
import static com.kevin.gateway.utils.Constants.RouteCommon;
import static org.springframework.cloud.gateway.server.mvc.filter.FilterFunctions.setPath;
import static org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions.route;

@Configuration
public class Routes {

    @Bean
    public RouterFunction<ServerResponse> productServiceRoute() {
         return route(ProductService.ROUTE_ID.getValue())
                 .route(RequestPredicates.path(ProductService.PATH.getValue()), HandlerFunctions.http(ProductService.HOST.getValue()))
                 .filter(CircuitBreakerFilterFunctions.circuitBreaker(ProductService.CIRCUIT_BREAKER_ID.getValue(),
                         URI.create(RouteCommon.FORWARD_FALLBACK.getValue())))
                 .build();
    }

    @Bean
    public RouterFunction<ServerResponse> productServiceSwaggerRoute() {
        return route(ProductService.ROUTE_SWAGGER_ID.getValue())
                .route(RequestPredicates.path(ProductService.PATH_SWAGGER.getValue()), HandlerFunctions.http(ProductService.HOST.getValue()))
                .filter(CircuitBreakerFilterFunctions.circuitBreaker(ProductService.CIRCUIT_BREAKER_SWAGGER_ID.getValue(),
                        URI.create(RouteCommon.FORWARD_FALLBACK.getValue())))
                .filter(setPath(RouteCommon.API_DOCS.getValue()))
                .build();
    }

    @Bean
    public RouterFunction<ServerResponse> orderServiceRoute() {
        return route(OrderService.ROUTE_ID.getValue())
                .route(RequestPredicates.path(OrderService.PATH.getValue()), HandlerFunctions.http(OrderService.HOST.getValue()))
                .filter(CircuitBreakerFilterFunctions.circuitBreaker(OrderService.CIRCUIT_BREAKER_ID.getValue(),
                        URI.create(RouteCommon.FORWARD_FALLBACK.getValue())))
                .build();
    }

    @Bean
    public RouterFunction<ServerResponse> orderServiceSwaggerRoute() {
        return route(OrderService.ROUTE_SWAGGER_ID.getValue())
                .route(RequestPredicates.path(OrderService.PATH_SWAGGER.getValue()), HandlerFunctions.http(OrderService.HOST.getValue()))
                .filter(CircuitBreakerFilterFunctions.circuitBreaker(OrderService.CIRCUIT_BREAKER_SWAGGER_ID.getValue(),
                        URI.create(RouteCommon.FORWARD_FALLBACK.getValue())))
                .filter(setPath(RouteCommon.API_DOCS.getValue()))
                .build();
    }

    @Bean
    public RouterFunction<ServerResponse> inventoryServiceRoute() {
        return route(InventoryService.ROUTE_ID.getValue())
                .route(RequestPredicates.path(InventoryService.PATH.getValue()), HandlerFunctions.http(InventoryService.HOST.getValue()))
                .filter(CircuitBreakerFilterFunctions.circuitBreaker(InventoryService.CIRCUIT_BREAKER_ID.getValue(),
                        URI.create(RouteCommon.FORWARD_FALLBACK.getValue())))
                .build();
    }

    @Bean
    public RouterFunction<ServerResponse> inventoryServiceSwaggerRoute() {
        return route(InventoryService.ROUTE_SWAGGER_ID.getValue())
                .route(RequestPredicates.path(InventoryService.PATH_SWAGGER.getValue()), HandlerFunctions.http(InventoryService.HOST.getValue()))
                .filter(CircuitBreakerFilterFunctions.circuitBreaker(InventoryService.CIRCUIT_BREAKER_SWAGGER_ID.getValue(),
                        URI.create(RouteCommon.FORWARD_FALLBACK.getValue())))
                .filter(setPath(RouteCommon.API_DOCS.getValue()))
                .build();
    }

    @Bean
    public RouterFunction<ServerResponse> fallbackRoute() {
        return route(RouteCommon.FALLBACK_ROUTE.getValue())
                .GET(RouteCommon.FALLBACK_PATH.getValue(), request -> ServerResponse.status(HttpStatus.SERVICE_UNAVAILABLE)
                        .body("Service Unavailable, please try again later"))
                .build();
    }
}
