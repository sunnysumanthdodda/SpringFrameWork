package com.example.learnspringframework;

import com.example.learnspringframework.game.GameRunner;
import com.example.learnspringframework.game.MarioGame;
import com.example.learnspringframework.game.PacManGame;
import com.example.learnspringframework.game.SuperContraGame;


public class AppGamingBasic {
    public static void main(String[] args) {

        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var pacManGame = new PacManGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
