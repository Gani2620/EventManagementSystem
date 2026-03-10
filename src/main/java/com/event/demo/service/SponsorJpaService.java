package com.event.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.demo.entity.Event;
import com.event.demo.entity.Sponsor;
import com.event.demo.repository.EventRepository;
import com.event.demo.repository.SponsorJPARepository;
import com.event.demo.repository.SponsorRespository;

@Service
public class SponsorJpaService implements SponsorRespository{
	@Autowired
	private SponsorJPARepository sponsorrepo;
	
	public SponsorJpaService(SponsorJPARepository sponsorrepo) {
		super();
		this.sponsorrepo = sponsorrepo;
	}

	@Override
	public List<Sponsor> getAllSponsor() {
		
		return sponsorrepo.findAll();
	}

	@Override
	public Sponsor getSponsorById(int sponsorId) {
		
		return sponsorrepo.findById(sponsorId).orElseThrow();
	}

	@Override
	public Sponsor createSponsor(Sponsor sponsor) {
		
		return sponsorrepo.save(sponsor);
	}

	@Override
	public Sponsor updateSponsor(int sponsorId, Sponsor sponsor) {
		Sponsor exist = getSponsorById(sponsorId);
		exist.setSponsorName(sponsor.getSponsorName()); 
		exist.setIndustry(sponsor.getIndustry()); 
		exist.setEvents(sponsor.getEvents()); 
		return sponsorrepo.save(exist);
	}

	@Override
	public void deleteSponsor(int sponsorId) {
		sponsorrepo.deleteById(sponsorId);
		
	}
	public List<Event> getEventsBySponsor(int sponsorId) {
        Sponsor sponsor = getSponsorById(sponsorId);
        return sponsor.getEvents();
	}

}
