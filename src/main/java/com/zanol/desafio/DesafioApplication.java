package com.zanol.desafio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.zanol.desafio.entities.Order;
import com.zanol.desafio.services.OrderService;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	@Autowired
	OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	private void showOrder(Order order) {
		System.out.printf("Pedido Código: %d%n", order.getCode());
		System.out.printf("Valor Total: R$%.2f%n\n", orderService.total(order));
	}
	
	@Override
	public void run(String... args) throws Exception {
		Order order1 = new Order(1034, 150.0, 20.0);	
		showOrder(order1);
		
		Order order2 = new Order(2282, 800.0, 10.0);
		showOrder(order2);
		
		Order order3 = new Order(1309, 95.90, 0.0);
		showOrder(order3);
	}

}
