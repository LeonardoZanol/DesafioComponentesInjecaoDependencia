package com.zanol.desafio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zanol.desafio.entities.Order;

@Service
public class OrderService {

	@Autowired
	ShippingService shippingService;
	
	public double total(Order order) {
		return order.getBasic() - (order.getBasic() * order.getDiscount() / 100) + shippingService.shipment(order);
	}
	
}
