package com.event.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.event.demo.entity.Event;
import com.event.demo.entity.Sponsor;
import com.event.demo.service.SponsorJpaService;
@RestController
@RequestMapping("/sponsors")
@CrossOrigin(origins = "https://d37rmynz82pd73.cloudfront.net")
public class SponsorController {
	
	@Autowired
	private SponsorJpaService sponsorService; 
	
	@GetMapping("/{sponsorId}/events")
	public List<Event> getEventBySponsor(@PathVariable int sponsorId){
		return sponsorService.getEventsBySponsor(sponsorId);
	}
		
	}
	   

