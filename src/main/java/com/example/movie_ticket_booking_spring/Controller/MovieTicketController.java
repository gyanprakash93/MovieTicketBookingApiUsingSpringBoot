package com.example.movie_ticket_booking_spring.Controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movie_ticket_booking_spring.Entity.MovieEntity;
import com.example.movie_ticket_booking_spring.Entity.TicketEntity;
import com.example.movie_ticket_booking_spring.Service.MovieService;
import com.example.movie_ticket_booking_spring.Service.TicketService;

@RestController
@RequestMapping("/api")
public class MovieTicketController {

    // @Autowired
    private MovieService movieService;

    // @Autowired
    private TicketService ticketService;

    public MovieTicketController(MovieService movieService, TicketService ticketService) {
        this.movieService = movieService;
        this.ticketService = ticketService;
    }

    @GetMapping("/getmoviebyid/{id}")
    public Optional<MovieEntity> movieById(@PathVariable Long id) {
        return movieService.getMovieById(id);
    }

    @GetMapping("/getTicketById/{id}")
    public TicketEntity ticketById(@PathVariable Long id) {
        return ticketService.getTicketById(id);
    }

    @PostMapping("/bookMovieTicket")
    public TicketEntity bookMovieTicket(@RequestBody TicketEntity entity) {
        return ticketService.bookTicket(entity);
    }
}
