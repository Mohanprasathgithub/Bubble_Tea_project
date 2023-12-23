package com.example.mohan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class HomeController {
	
	

	    @GetMapping("/Home")
	    public String Homepage(Model model) {
	    		 return "index";
	    }
	    @GetMapping("/bubble")
	    public String About(Model model1) {
	    	 return "bubble";
	    }
	    @GetMapping("/index")
	    public String About1(Model model1) {
	    	 return "index";
	    }
	    @GetMapping("/bubble#About")
	    public String About2(Model model1) {
	    	 return "bubble";
	    }
	    @GetMapping("/bubble#Menus")
	    public String About3(Model model1) {
	    	 return "bubble";
	    }
	    @GetMapping("/bubble#Contact")
	    public String About4(Model model1) {
	    	 return "bubble";
	    }
	    @GetMapping("/FF2")
	    public String About5(Model model1) {
	    	 return "FF2";
	    
	}
	    @GetMapping("/FF3")
	    public String About6(Model model1) {
	    	 return "FF3";
	}
	    @GetMapping("/order")
	    public String About7(Model model1) {
	    	 return "order";
	}
	    @GetMapping("/Admin")
	    public String About8(Model model1) {
	    	 return "Admin";
}
	    @GetMapping("/Thank")
	    public String About9(Model model1) {
	    	 return "Thank";
}
	    @GetMapping("/contact_view")
	    public String About10(Model model1) {
	    	 return "contact_view";
}
	    @GetMapping("/order_view")
	    public String About11(Model model1) {
	    	 return "order_view";
}
	    @GetMapping("/Admin_home")
	    public String About12(Model model1) {
	    	 return "Admin_home";
}
	    }
