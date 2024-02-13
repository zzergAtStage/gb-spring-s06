package com.zergatstage.gbsprings06.controllers;

import com.zergatstage.gbsprings06.model.Characters;
import com.zergatstage.gbsprings06.model.Result;
import com.zergatstage.gbsprings06.services.ServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/home")
public class SimpleController {

    @Autowired
    private ServiceAPI serviceAPI;
    @GetMapping
    public String getAllCharacters(Model model){
        Characters characters = serviceAPI.getAllCharacters();
        List<Result> listCharacters = characters.getResults();

        model.addAttribute("characters",characters.getResults());
        model.addAttribute("characterCount", characters.getInfo().getCount());
        model.addAttribute("totalPages", characters.getInfo().getPages());
        model.addAttribute("currentPage", characters.getInfo().getPrev());
        return "home";
    }
}
