package com.event.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="event")
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eventId;
	
	private String eventName;
	private String date;
	@ManyToMany
	@JoinTable(
			name="event_sponsor",
			joinColumns=@JoinColumn(name="event_Id"),
			inverseJoinColumns = @JoinColumn(name="sponsor_Id")
			)
	private List<Sponsor> sponsors;
	
	public Event() {
		// TODO Auto-generated constructor stub
	}

//	public Event( String eventName, String date, List<Sponsor> sponsors) {
//		this.eventName = eventName;
//		this.date = date;
//		this.sponsors = sponsors;
//	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<Sponsor> getSponsors() {
		return sponsors;
	}

	public void setSponsor(List<Sponsor> sponsors) {
		this.sponsors = sponsors;
	}
	
	
	
	
	
}
