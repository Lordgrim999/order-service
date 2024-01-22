package com.ecommerce.OrderService.entity;

import com.ecommerce.OrderService.DTO.FoodItem;
import com.ecommerce.OrderService.DTO.Restaurant;
import com.ecommerce.OrderService.DTO.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("order")
public class Order {

    private Long orderId;
    private List<FoodItem> foodItemsList;
    private Restaurant restaurant;
    private User user;
}
