package com.zergatstage.gbsprings06.services;

import com.zergatstage.gbsprings06.model.Characters;
import com.zergatstage.gbsprings06.model.Result;
import org.springframework.web.bind.annotation.PathVariable;

public interface ServiceAPI {

    /**
     * fetch all characters from API source
     * @return List of the Characters
     */
    public Characters getAllCharacters();

    public Result getCharacterDetailsById(@PathVariable("id") Long id);
}
