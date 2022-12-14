package com.thymeleafexamdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.thymeleafexamdemo.entity.Lead;
import com.thymeleafexamdemo.service.LeadService;

@Controller
public class LeadController {
	
	@Autowired
private LeadService leadService;
 
	
	
	@GetMapping("/createLeadPage")
	public String viewCreatePage() {
		return "create_lead";
	}
	@PostMapping("/saveLeads")
	public String saveLead(@ModelAttribute("lead") Lead lead,Model model) {
		leadService.saveOneLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
			}
	
	
	
}
