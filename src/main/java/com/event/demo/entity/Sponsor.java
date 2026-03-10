package com.event.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="sponsor")
public class Sponsor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sponsorId;
	private String sponsorName;
	private String industry;
	
	@ManyToMany(mappedBy = "sponsors")
	@JsonIgnoreProperties("sponsors")
	private List<Event> events;
	
	public Sponsor() {
		// TODO Auto-generated constructor stub
	}
	

//	public Sponsor(String sponsorName, String industry, List<Event> events) {
//		super();
//		this.sponsorName = sponsorName;
//		this.industry = industry;
//		this.events = events;
//	}


	public int getSponsorId() {
		return sponsorId;
	}

	public void setSponsorId(int sponsorId) {
		this.sponsorId = sponsorId;
	}

	public String getSponsorName() {
		return sponsorName;
	}

	public void setSponsorName(String sponsorName) {
		this.sponsorName = sponsorName;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}
	

	

}
