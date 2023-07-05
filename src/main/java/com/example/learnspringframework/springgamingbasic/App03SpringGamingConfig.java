package com.example.learnspringframework.springgamingbasic;

import com.example.learnspringframework.javagamingbasic.GameRunner;
import com.example.learnspringframework.javagamingbasic.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03SpringGamingConfig {
    public static void main(String[] args) {
        try (var gaming = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            gaming.getBean(GamingConsole.class).up();
            gaming.getBean(GameRunner.class).run();
        }
    }
}
