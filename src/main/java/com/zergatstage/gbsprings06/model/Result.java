package com.zergatstage.gbsprings06.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Result {
    @Id
    private Long id;
    private String name;
    private Status state;
    private String species;
    private String type;
    private String gender;
    @OneToOne
    private CharacterMarker origin;
    @OneToOne
    private CharacterMarker location;
    private String image;
    private String[] episode;
    private String url;
    private String created; //date LocalDateTime

    private enum Status {
        DEAD,
        ALIVE,
        UNKNOWN
    }
}
