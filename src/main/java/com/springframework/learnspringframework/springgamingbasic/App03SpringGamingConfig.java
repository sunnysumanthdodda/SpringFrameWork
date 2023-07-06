package com.springframework.learnspringframework.springgamingbasic;

import com.springframework.learnspringframework.javagamingbasic.GameRunner;
import com.springframework.learnspringframework.javagamingbasic.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03SpringGamingConfig {
    public static void main(String[] args) {
        try (var gaming = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            gaming.getBean(GamingConsole.class).up();
            gaming.getBean(GameRunner.class).run();
        }
    }
}
