package com.yxm.vo;

import java.util.List;


public class Platform {
    private Integer id;
    private String name;
    private List<Game> games;

    public Platform(Integer id) {
        this.id = id;
    }

    public Platform() {
    }

    public Platform(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
