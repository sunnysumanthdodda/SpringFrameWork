package com.example.learnspringframework.game;

public class GameRunner {
    private final GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run(){
        //System.out.println("Game running successfully "+game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}