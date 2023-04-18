package com.BikkadIUIToController.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AdditionController {

	@GetMapping("/add/{a}/{b}")
	public String Add(@PathVariable int a, @PathVariable int b, Model model) {
		
		int c= a+b;
		
		String msg="add of a and b"+c;
		
		model.addAttribute("ADD", msg);
		
		return "add";
		
	}
}
