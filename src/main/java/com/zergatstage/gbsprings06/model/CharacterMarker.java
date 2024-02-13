package com.zergatstage.gbsprings06.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CharacterMarker {
    @Id
    private Long id;
    private String name;
    private String url;
}
