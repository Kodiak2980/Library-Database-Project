package com.example.demo;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}
	
	@GetMapping("/signup")
	public String signup() {
		return "signup";
	}
	

}
