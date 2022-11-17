package com.thymeleafexamdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thymeleafexamdemo.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead,Long> {

}
