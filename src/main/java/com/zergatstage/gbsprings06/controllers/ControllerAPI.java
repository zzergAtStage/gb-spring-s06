package com.zergatstage.gbsprings06.controllers;

import com.zergatstage.gbsprings06.model.Characters;
import com.zergatstage.gbsprings06.model.Result;
import com.zergatstage.gbsprings06.services.ServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerAPI {
    @Autowired
    private ServiceAPI serviceAPI;

    @GetMapping("/")
    public ResponseEntity<Characters> getCharacters(){
        Characters allCharacters = serviceAPI.getAllCharacters();
        return new ResponseEntity<>(allCharacters, HttpStatus.OK);
    }

    @GetMapping("CharacterDetails/{id}")
    public ResponseEntity<Result> getCharacterDetails(@PathVariable("id") Long id){
        return new ResponseEntity<>(serviceAPI.getCharacterDetailsById(id),HttpStatus.OK);
    }
}
