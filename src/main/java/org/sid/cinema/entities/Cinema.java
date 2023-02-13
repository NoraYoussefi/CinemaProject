package org.sid.cinema.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Cinema implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCinema;
    @Column(length = 75)
    private String name;
    private double longitude,latitude, altitude;
    private int nombreSalles;
    @ManyToOne
    private Ville ville;

}
