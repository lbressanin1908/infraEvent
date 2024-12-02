package com.infraevento.api.domain.addres;

import com.infraevento.api.domain.event.Event;
import jakarta.persistence.*;

import java.util.UUID;

@Table(name = "addres")
@Entity

public class addres {
    @Id
    @GeneratedValue
    private UUID id;
    private String city;
    private String uf;

    @ManyToOne
    @JoinColumn
    private Event event;
}
