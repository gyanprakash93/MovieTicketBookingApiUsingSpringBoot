package com.example.movie_ticket_booking_spring.exception;

public class InvalidTicketIdException extends RuntimeException {
    public InvalidTicketIdException(String message) {
        super(message);
    }
}
