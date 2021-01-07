package com.company;

public class Game {
    Grid grid = new Grid();
    String movement;
    public void start(){
        movement =grid.displayGrid();
        setMovement();

    }
    public void setMovement(){
        switch (this.movement){
            case ("z") -> System.out.println("allez en haut");
            case ("d") -> System.out.println("allez a droite");
            case ("q") -> System.out.println("allez a gauche");
            case ("s") -> System.out.println("allez en bas");
        }
    }
}
