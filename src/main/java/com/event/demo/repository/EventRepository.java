package com.event.demo.repository;

import java.util.List;

import com.event.demo.entity.Event;
import com.event.demo.entity.Sponsor;

public interface EventRepository {
	List<Event> getAllEvents(); 
	Event getEventById(int eventId); 
	Event createEvent(Event event); 
	Event updateEvent(int eventId, Event event); 
	void deleteEvent(int eventId);
	

}
