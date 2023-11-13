package com.springframework.learnspringframework.javagamingbasic;

public class App01GamingBasic {
    public static void main(String[] args) {

        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var pacManGame = new PacManGame();
        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();
    }
}