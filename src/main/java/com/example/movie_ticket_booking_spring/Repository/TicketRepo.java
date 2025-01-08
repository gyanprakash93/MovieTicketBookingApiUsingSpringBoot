package com.example.movie_ticket_booking_spring.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.movie_ticket_booking_spring.Entity.TicketEntity;

@Repository
public interface TicketRepo extends CrudRepository<TicketEntity, Long> {

}
