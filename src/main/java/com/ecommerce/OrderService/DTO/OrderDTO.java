package com.ecommerce.OrderService.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {

    private Long orderId;
    private List<FoodItem> foodItemsList;
    private Restaurant restaurant;
    private Integer userId;
}
