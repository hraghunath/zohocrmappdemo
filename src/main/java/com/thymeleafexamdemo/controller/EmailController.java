package com.thymeleafexamdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
	public class EmailController {
		
		@PostMapping("/sendEmail")
		public String getEmailId(@RequestParam("email") String email,ModelMap model) {
			model.addAttribute("email", email);
			return "compose_email";
		}

}
