package hse.dymovand.cinema.controller;

import hse.dymovand.cinema.model.Movie;
import hse.dymovand.cinema.model.ShowTime;
import hse.dymovand.cinema.model.Ticket;
import hse.dymovand.cinema.repository.MovieRepository;
import hse.dymovand.cinema.repository.ShowTimeRepository;
import hse.dymovand.cinema.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CinemaController {

    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private ShowTimeRepository showtimeRepository;
    @Autowired
    private TicketRepository ticketRepository;

    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @GetMapping("/showtimes")
    public List<ShowTime> getAllShowTimes() {
        return showtimeRepository.findAll();
    }

    @PostMapping("/tickets")
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketRepository.save(ticket);
    }
}

