package com.example.mohan;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class Contact_controll {

	@Autowired
    private Contact_service cs;

	// handler method to handle list of users
	@GetMapping("/mohan")
    public String index(Model model) {
        List<Contact_us> users = cs.getAllUsers();
        model.addAttribute("users", users);
        model.addAttribute("userForm", new Contact_us());
        return "contact_view";
    }
	
	
    @PostMapping("/")
    public String registerUsers(@ModelAttribute("Contact_Form") Contact_us user,Model model_1)
    {
        cs.saveUser(user);
        return "bubble";
    }
}
