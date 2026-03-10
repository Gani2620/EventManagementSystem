package com.event.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.event.demo.entity.Event;
import com.event.demo.entity.Sponsor;
import com.event.demo.repository.EventJPARepository;
import com.event.demo.repository.EventRepository;

@Service
public class EventJpaService implements EventRepository  {
	
	private EventJPARepository eventrepo;
	

	public EventJpaService(EventJPARepository eventrepo) {
		super();
		this.eventrepo = eventrepo;
	}

	@Override
	public List<Event> getAllEvents() {
		
		return eventrepo.findAll();
	}

	@Override
	public Event getEventById(int eventId) {
		
		return eventrepo.findById(eventId).orElseThrow();
	}

	@Override
	public Event createEvent(Event event) {
		System.out.println(event);
		return eventrepo.save(event);
	}

	@Override
	public Event updateEvent(int eventId, Event event) {
		Event exist = getEventById(eventId);
		exist.setEventName(event.getEventName());
		exist.setDate(event.getDate());
		exist.setSponsor(event.getSponsors());
		return  eventrepo.save(exist);
	}

	@Override
	public void deleteEvent(int eventId) {
		eventrepo.deleteById(eventId);
		
	}
	public List<Sponsor> getSponsorsByEvent(int eventId) {
        Event event = getEventById(eventId);
        return event.getSponsors();
    }
	
	

}
