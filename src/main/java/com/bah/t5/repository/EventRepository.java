package com.bah.t5.repository;

import org.springframework.data.repository.CrudRepository;

import com.bah.t5.domain.Event;

public interface EventRepository extends CrudRepository<Event, Long> {

}
