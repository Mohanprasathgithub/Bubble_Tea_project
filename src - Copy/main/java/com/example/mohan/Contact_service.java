package com.example.mohan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class Contact_service {

	@Autowired
	private Contact_Repositry cr;
	

    public List<Contact_us> getAllUsers() {
        return cr.findAll();
    }

    public Contact_us saveUser(Contact_us user) {
        return cr.save(user);
    }
}
