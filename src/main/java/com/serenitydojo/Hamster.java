package com.serenitydojo;

public class Hamster extends Pet {

    private String favoriteGame;

    public Hamster(String name, int age, String favouriteGame) {
        super(name, age);
        this.favoriteGame = favouriteGame;

    }

    public String getFavoriteGame() {
        return favoriteGame;
    }

    public String play() {
        return "runs in wheel";
    }
}
