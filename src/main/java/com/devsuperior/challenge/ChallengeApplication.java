package com.devsuperior.challenge;

import com.devsuperior.challenge.entities.Order;
import com.devsuperior.challenge.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class ChallengeApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(ChallengeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);

		Order order1 = new Order(1034, 150.00, 20.00);
		System.out.println("Pedido código " + order1.getCode());
		System.out.printf("Valor total: R$ %.2f", orderService.total(order1));

		System.out.println("\n");
		Order order2 = new Order(2282, 800.00, 10.00);
		System.out.println("Pedido código " + order2.getCode());
		System.out.printf("Valor total: R$ %.2f", orderService.total(order2));

		System.out.println("\n");
		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.println("Pedido código " + order3.getCode());
		System.out.printf("Valor total: R$ %.2f", orderService.total(order3));
	}
}
