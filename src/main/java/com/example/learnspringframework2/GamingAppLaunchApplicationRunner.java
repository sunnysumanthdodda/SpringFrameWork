package com.example.learnspringframework2;

import com.example.learnspringframework.javagamingbasic.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.learnspringframework.javagamingbasic")
public class GamingAppLaunchApplicationRunner {
    public static void main(String[] args) {
        try (var gaming = new AnnotationConfigApplicationContext(GamingAppLaunchApplicationRunner.class)) {
            gaming.getBean(GameRunner.class).run();
        }
    }
}