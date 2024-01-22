package com.ecommerce.OrderService.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTOFromFE {

    private List<FoodItem> foodItemsList;
    private Restaurant restaurant;
    private Integer userId;
}
