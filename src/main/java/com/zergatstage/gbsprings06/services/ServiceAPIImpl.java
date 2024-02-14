package com.zergatstage.gbsprings06.services;

import com.zergatstage.gbsprings06.model.Characters;
import com.zergatstage.gbsprings06.model.ResourceNotFoundException;
import com.zergatstage.gbsprings06.model.Result;
import com.zergatstage.gbsprings06.model.URLtemplates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service

public class ServiceAPIImpl implements ServiceAPI {

    @Autowired
    private RestTemplate template;

    @Autowired
    private HttpHeaders headers;


    @Autowired
    private URLtemplates urLtemplates;


    /**
     * fetch all characters from API source
     *
     * @return List of the Characters
     */
    @Override
    public Characters getAllCharacters() {
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity =  new HttpEntity<>(headers);
        ResponseEntity<Characters>  response = template.exchange(urLtemplates.getApiUrl(), HttpMethod.GET
                ,entity, Characters.class);
        return response.getBody();
    }

    /**
     * fetch a character detials
     * @param id fetched from home screen under character link
     * @return fetchet character details in json
     */
    @Override
    public Result getCharacterDetailsById(Long id) {
        Characters characters = getAllCharacters();
        return characters.getResults().stream()
                .filter( e -> e.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("there is no character with id=" + id));
    }
}
