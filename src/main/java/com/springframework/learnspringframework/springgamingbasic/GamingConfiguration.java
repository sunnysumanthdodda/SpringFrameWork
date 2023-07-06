package com.springframework.learnspringframework.springgamingbasic;

import com.springframework.learnspringframework.javagamingbasic.GameRunner;
import com.springframework.learnspringframework.javagamingbasic.GamingConsole;
import com.springframework.learnspringframework.javagamingbasic.PacManGame;
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
