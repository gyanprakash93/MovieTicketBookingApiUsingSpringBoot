package com.example.movie_ticket_booking_spring.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.movie_ticket_booking_spring.Entity.MovieEntity;
import com.example.movie_ticket_booking_spring.Repository.MovieRepo;

@Service
public class MovieService {

    // @Autowired
    private MovieRepo movieRepo;

    public MovieService(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }

    public Optional<MovieEntity> getMovieById(Long id) {
        // Optional<MovieEntity> movie = movieRepo.findById(id);
        // return movie.orElseThrow(() -> new RuntimeException("Movie not found for the
        // id - " + id));
        return movieRepo.findById(id);
    }
}
