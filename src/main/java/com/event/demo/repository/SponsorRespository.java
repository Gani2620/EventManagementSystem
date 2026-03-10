package com.event.demo.repository;

import java.util.List;

import com.event.demo.entity.Event;
import com.event.demo.entity.Sponsor;

public interface SponsorRespository {
	List<Sponsor> getAllSponsor();
	Sponsor getSponsorById(int sponsorId);
	Sponsor createSponsor(Sponsor sponsor);
	Sponsor updateSponsor(int sponsorId, Sponsor sponsor); 
	void deleteSponsor(int sponsorId);

}
