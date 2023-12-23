package com.example.mohan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Order_service {

	@Autowired
	private Order_repositry or;
	
	public List<Order_us> getAllUsers() {
        return or.findAll();
    }

    public Order_us saveUsers(Order_us users) {
        return or.save(users);
    }
}
