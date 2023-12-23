package com.example.mohan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Order_controller {

	@Autowired
	private Order_service os;
	// handler method to handle list of users
		@GetMapping("/mohan1")
	    public String index(Model model) {
	        List<Order_us> users = os.getAllUsers();
	        model.addAttribute("users", users);
	        model.addAttribute("userForm", new Order_us());
	        return "order_view";
	    }

    @PostMapping("/order")
    public String registerUser(@ModelAttribute("Order_Form") Order_us user,Model model)
    {
        os.saveUsers(user);
        return "index";
    }
}
