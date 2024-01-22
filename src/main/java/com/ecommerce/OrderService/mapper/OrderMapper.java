package com.ecommerce.OrderService.mapper;

import com.ecommerce.OrderService.DTO.OrderDTO;
import com.ecommerce.OrderService.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order mapOrderDTOToOrder(OrderDTO orderDTO);

    OrderDTO mapOrderToOrderDTO(Order order);
}

