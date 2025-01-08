package com.example.movie_ticket_booking_spring.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.movie_ticket_booking_spring.Entity.TicketEntity;
import com.example.movie_ticket_booking_spring.Repository.TicketRepo;

@Service
public class TicketService {

    // @Autowired
    private TicketRepo ticketRepo;

    public TicketService(TicketRepo ticketRepo) {
        this.ticketRepo = ticketRepo;
    }

    public TicketEntity getTicketById(Long id) {

        Optional<TicketEntity> ticket = ticketRepo.findById(id);
        return ticket.orElseThrow(() -> new RuntimeException("Ticket not found for the id - " + id));
    }

    public TicketEntity bookTicket(TicketEntity entity) {

        entity.setPrice(entity.getUnitPrice() * entity.getNoOfTickets());
        return ticketRepo.save(entity);
    }
}
