package com.devsuperior.challenge.services;

import com.devsuperior.challenge.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order){
        double discount = order.getBasic() * (order.getDiscount() / 100);
        double basic = order.getBasic() - discount;
        return basic + shippingService.shipment(order);
    }
}
