package org.sid.cinema.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Ticket {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTicket;
    @Column(length = 75)
    private String nomClient;
    private  double prix;
    @Column(unique = true)
    private  int codePaiment;
    private  boolean reserve;
    @ManyToOne
    private Projection projection;
    @ManyToOne
    private Place place;
}
