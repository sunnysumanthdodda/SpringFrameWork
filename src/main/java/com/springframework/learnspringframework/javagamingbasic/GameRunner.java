package com.springframework.learnspringframework.javagamingbasic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private final GamingConsole game;
    public GameRunner(@Qualifier(value = "PacManGameQualifier") GamingConsole game) {
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