package com.ecommerce.OrderService.Repository;

import com.ecommerce.OrderService.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order,Integer> {
}
