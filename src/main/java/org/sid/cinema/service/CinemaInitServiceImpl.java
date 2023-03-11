package org.sid.cinema.service;

import org.sid.cinema.dao.CinemaRepository;
import org.sid.cinema.dao.VilleRepository;
import org.sid.cinema.entities.Cinema;
import org.sid.cinema.entities.Salle;
import org.sid.cinema.entities.Ville;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
public class CinemaInitServiceImpl implements ICinemaInitService
{
    @Autowired
    private VilleRepository villeRepository;
    @Autowired
    private CinemaRepository cinemaRepository;

    @Override
    public void initVilles() {
        Stream.of("Tetouan", "Tanger", "Rabat", "Casa").forEach(nomVille->{
            Ville ville=new Ville();
            ville.setName(nomVille);
            villeRepository.save(ville);
        });

    }

    @Override
    public void initCinemas() {
      villeRepository.findAll().forEach(v->{
          Stream.of("Cinema1", "Cinema2", "Cinema3", "Cinema5").forEach(nomCinema->{
              Cinema cinema=new Cinema();
              cinema.setName(nomCinema);
              cinema.setNombreSalles(3+(int)(Math.random()*7));
              cinema.setVille(v);
          });
      });
    }

    @Override
    public void initSalles() {
        cinemaRepository.findAll().forEach(c->{
            Stream.of("Cinema1", "Cinema2", "Cinema3", "Cinema5").forEach(nomSalle->{
                Salle salle=new Salle();
                salle.setName(nomSalle);
                salle.setCinema(c);
            });
        });
    }

    @Override
    public void initPlaces() {

    }

    @Override
    public void initSeances() {

    }

    @Override
    public void initCategories() {

    }

    @Override
    public void initFilms() {

    }

    @Override
    public void initProjections() {

    }

    @Override
    public void initTickets() {

    }
}
