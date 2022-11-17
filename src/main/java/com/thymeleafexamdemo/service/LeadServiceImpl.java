package com.thymeleafexamdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thymeleafexamdemo.entity.Lead;
import com.thymeleafexamdemo.repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
 private LeadRepository leadRepo;
	@Override
	public void saveOneLead(Lead lead) {
		leadRepo.save(lead);

	}

}
