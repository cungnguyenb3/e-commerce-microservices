package com.kevin.microservices.product.util;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Constants {

    @Getter
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    public enum KafkaTopics {
        INVENTORY_UPDATE("inventory-update");

        private final String value;
    }
}
