package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("message", "Huy hahahahaha");
		return "index";
	}
}
