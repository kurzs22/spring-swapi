package com.wildcodeschool.swapi.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wildcodeschool.swapi.model.People;
import com.wildcodeschool.swapi.model.Planet;
import com.wildcodeschool.swapi.util.ProxyConfiguration;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Controller
public class SwapiController {

    private static final String SWAPI_URL = "https://swapi.dev/api";

    private WebClient webClient = WebClient.builder().clientConnector(ProxyConfiguration.getProxiedConnector()).baseUrl(SWAPI_URL).build();

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/planet")
    public String planet(Model model, @RequestParam Long id) {

        Planet planetObject = null;
        
        // DONE : call the API and retrieve the planet
        
        //WebClient webClient = WebClient.create(SWAPI_URL);
        Mono<String> call = webClient.get()
              .uri(uriBuilder -> uriBuilder
                      .path("/planets/{id}/")
                      .build(id))
              .retrieve()
              .bodyToMono(String.class);
        
        String response = call.block();

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            planetObject = objectMapper.readValue(response, Planet.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        model.addAttribute("planetInfos", planetObject);

        return "planet";
    }

    @GetMapping("/people")
    public String people(Model model, @RequestParam Long id) {

        //WebClient webClient = WebClient.create(SWAPI_URL);
        Mono<String> call = webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/people/{id}/")
                        .build(id))
                .retrieve()
                .bodyToMono(String.class);

        String response = call.block();

        ObjectMapper objectMapper = new ObjectMapper();
        People peopleObject = null;
        try {
            peopleObject = objectMapper.readValue(response, People.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        model.addAttribute("peopleInfos", peopleObject);

        return "people";
    }
}
