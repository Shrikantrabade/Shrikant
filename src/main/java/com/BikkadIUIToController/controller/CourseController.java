package com.BikkadIUIToController.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CourseController {

	@GetMapping("/course")
	public String course(@RequestParam String cname,Model model) {
		
		String msg="New"+ cname +"Batch start from 1 May ";
		System.out.println(msg);
		model.addAttribute("CNAME", msg);
		return "course";
		
		
	}
	
	@GetMapping("/coursetrainer")
	public String courseandTrainer(@RequestParam String cname,@RequestParam String tname,Model model) {
		
		String msg="New"+ cname +"Batch by"+tname+"will start from 1 May ";
		System.out.println(msg);
		model.addAttribute("CNAME", msg);
		return "course";
		
		
	}
}
