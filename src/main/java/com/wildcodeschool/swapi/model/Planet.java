package com.wildcodeschool.swapi.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Planet {
    // JSON example:
    // {
    //     "name": "Tatooine", 
    //     "rotation_period": "23", 
    //     "orbital_period": "304", 
    //     "diameter": "10465", 
    //     "climate": "arid", 
    //     "gravity": "1 standard", 
    //     "terrain": "desert", 
    //     "surface_water": "1", 
    //     "population": "200000", 
    //     "residents": [
    //         "https://swapi.dev/api/people/1/", 
    //         "https://swapi.dev/api/people/2/", 
    //         "https://swapi.dev/api/people/4/", 
    //         "https://swapi.dev/api/people/6/", 
    //         "https://swapi.dev/api/people/7/", 
    //         "https://swapi.dev/api/people/8/", 
    //         "https://swapi.dev/api/people/9/", 
    //         "https://swapi.dev/api/people/11/", 
    //         "https://swapi.dev/api/people/43/", 
    //         "https://swapi.dev/api/people/62/"
    //     ], 
    //     "films": [
    //         "https://swapi.dev/api/films/1/", 
    //         "https://swapi.dev/api/films/3/", 
    //         "https://swapi.dev/api/films/4/", 
    //         "https://swapi.dev/api/films/5/", 
    //         "https://swapi.dev/api/films/6/"
    //     ], 
    //     "created": "2014-12-09T13:50:49.641000Z", 
    //     "edited": "2014-12-20T20:58:18.411000Z", 
    //     "url": "https://swapi.dev/api/planets/1/"
    // }

    // DONE : add attributes

    private String name;
    @JsonProperty("rotation_period")
    private String rotationPeriod;
    @JsonProperty("orbital_period")
    private String orbitalPeriod;
    private String diameter;
    private String climate;
    private String gravity;
    private String terrain;
    @JsonProperty("surface_water")
    private String surfaceWater;
    private String population;
    private List<String> residents;
    private List<String> films;
    private String created;
    private String edited;
    private String url;
    
    // DONE : add an empty constructor

    public Planet() {
    }
    
    // DONE : add getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRotationPeriod() {
        return rotationPeriod;
    }

    public void setRotationPeriod(String rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
    }

    public String getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(String orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public String getSurfaceWater() {
        return surfaceWater;
    }

    public void setSurfaceWater(String surfaceWater) {
        this.surfaceWater = surfaceWater;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public List<String> getResidents() {
        return residents;
    }

    public void setResidents(List<String> residents) {
        this.residents = residents;
    }

    public List<String> getFilms() {
        return films;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    


}
