package com.example.movie_ticket_booking_spring.exception;

public class InvalidMovieIdException extends RuntimeException {
    public InvalidMovieIdException(String message) {
        super(message);
    }
}
