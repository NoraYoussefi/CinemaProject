package org.sid.cinema.web;

import org.sid.cinema.dao.FilmRepository;
import org.sid.cinema.entities.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CinemaRestController {
    @Autowired
    private FilmRepository filmRepository;

    @GetMapping("listFilms")
    public List<Film> listFilms(){
        return filmRepository.findAll();
    }
}
