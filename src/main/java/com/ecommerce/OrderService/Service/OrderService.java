package com.ecommerce.OrderService.Service;

import com.ecommerce.OrderService.DTO.OrderDTO;
import com.ecommerce.OrderService.DTO.OrderDTOFromFE;
import com.ecommerce.OrderService.DTO.User;
import com.ecommerce.OrderService.Repository.OrderRepository;
import com.ecommerce.OrderService.entity.Order;
import com.ecommerce.OrderService.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private SequenceGenerator sequenceGenerator;

    @Autowired
    RestTemplate restTemplate;

    public OrderDTO saveOrderInDb(OrderDTOFromFE orderDetails) {

        long newOrderId = sequenceGenerator.generateSequence("sequence");
        User user = fetchUserById(orderDetails.getUserId());
        Order orderToBeSaved = new Order(newOrderId, orderDetails.getFoodItemsList(), orderDetails.getRestaurant(), user);
        orderRepository.save(orderToBeSaved);
        return OrderMapper.INSTANCE.mapOrderToOrderDTO(orderToBeSaved);
    }

    private User fetchUserById(Integer userId) {

        return restTemplate.getForObject("http://USER-SERVICE/user/fetchById/" + userId, User.class);
    }
}
