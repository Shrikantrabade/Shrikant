package com.BikkadIUIToController.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.BikkadITUIToController.User;

@Controller
public class Usercontroller {

	@GetMapping("/loadform")
	public String loadForm() {
		
		
		return "RegForm";
		
	}
	
	@GetMapping("/saveUser")
	public String saveUser(User user,Model model) {
		System.out.println(user);
		
		String msg="Hii"+user.getFname()+"Your Registration successfully";
		model.addAttribute("MSG", msg);
		return "RegSuccess";
		
		
	}
}
