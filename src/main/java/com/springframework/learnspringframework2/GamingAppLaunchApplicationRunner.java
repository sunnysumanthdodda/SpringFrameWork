package com.springframework.learnspringframework2;

import com.springframework.learnspringframework.javagamingbasic.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.springframework.learnspringframework.javagamingbasic")
public class GamingAppLaunchApplicationRunner {
    public static void main(String[] args) {
        try (var gaming = new AnnotationConfigApplicationContext(GamingAppLaunchApplicationRunner.class)) {
            gaming.getBean(GameRunner.class).run();
        }
    }
}