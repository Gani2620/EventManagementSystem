package com.event.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.event.demo.entity.Event;
@Repository
public interface EventJPARepository extends JpaRepository<Event, Integer> {

}
