package org.sid.cinema.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Ville {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVille;
    @Column(length = 75)
    private String name;
    private double longitude,latitude, altitude;
    @OneToMany(mappedBy = "ville")   //une association bidirectionnelle
    private Collection<Cinema> cinemas;
}

