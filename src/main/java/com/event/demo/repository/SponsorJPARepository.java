package com.event.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.event.demo.entity.Sponsor;
@Repository
public interface SponsorJPARepository extends JpaRepository<Sponsor, Integer> {

}
