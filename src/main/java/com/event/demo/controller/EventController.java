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
import com.event.demo.service.EventJpaService;
import com.event.demo.service.SponsorJpaService;

@RestController
@RequestMapping("/events")
@CrossOrigin(origins = "https://d37rmynz82pd73.cloudfront.net")
public class EventController {
	
	@Autowired
	private EventJpaService eventservice;
	private SponsorJpaService sponsorservice;
	
	
	public EventController(EventJpaService eventservice, SponsorJpaService sponsorservice) {
		super();
		this.eventservice = eventservice;
		this.sponsorservice = sponsorservice;
	}
	//Api 1
	@GetMapping
	public List<Event> getAllEvents(){
		return eventservice.getAllEvents();
	}
	//api2
	@PostMapping
	public Event createEvent(@RequestBody Event event) {
		return eventservice.createEvent(event);
	}
	//api3
	@GetMapping("/{eventId}")
	public Event getEventById(@PathVariable int eventId) {
		return eventservice.getEventById(eventId);
	}
	//api4
	@PutMapping("/{eventId}")
	public Event updateEvent(@PathVariable int eventId,@RequestBody Event event ) {
		
		return eventservice.updateEvent(eventId, event);
	}//api 5
	@DeleteMapping("/{eventId}")
	public void deleteEvent(@PathVariable int eventId) { 
		eventservice.deleteEvent(eventId);
	}
	//api6
	@GetMapping("/{eventId}/sponsors")
	public List<Sponsor> getSponsorByEvent(@PathVariable int eventId){
		return eventservice.getSponsorsByEvent(eventId);
	}
	//api 7
		@GetMapping("/sponsors")
		public List<Sponsor> getAllSponsors() { 
			return sponsorservice.getAllSponsor(); 
		} 
		//api 8
		@PostMapping("/sponsors")
		public Sponsor createSponsor(@RequestBody Sponsor sponsor) { 
			return sponsorservice.createSponsor(sponsor); 
		} 
		//api 9
		@GetMapping("/sponsors/{sponsorId}") 
		public Sponsor getSponsorById(@PathVariable int sponsorId) { 
			return sponsorservice.getSponsorById(sponsorId); 
		} 
		//api 10
		@PutMapping("/sponsors/{sponsorId}") 
		public Sponsor updateSponsor(@PathVariable int sponsorId, @RequestBody Sponsor sponsor) { 
			return sponsorservice.updateSponsor(sponsorId, sponsor); 
		} 
		//api 11
		@DeleteMapping("/sponsors/{sponsorId}") 
		public void deleteSponsor(@PathVariable int sponsorId) { 
			sponsorservice.deleteSponsor(sponsorId); 
		}

}
