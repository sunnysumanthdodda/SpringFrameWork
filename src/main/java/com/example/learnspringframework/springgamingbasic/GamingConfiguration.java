package com.example.learnspringframework.springgamingbasic;

import com.example.learnspringframework.javagamingbasic.GameRunner;
import com.example.learnspringframework.javagamingbasic.GamingConsole;
import com.example.learnspringframework.javagamingbasic.PacManGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game(){
        return new PacManGame();
    }

    @Bean
    public GameRunner gameRunner(){
        return new GameRunner(game());
    }
}
