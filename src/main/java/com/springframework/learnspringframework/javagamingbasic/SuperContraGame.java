package com.springframework.learnspringframework.javagamingbasic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContraGame implements GamingConsole {

    public void up(){
        System.out.println("Go high");
    }
    public void down(){
        System.out.println("Go down");
    }
    public void left(){
        System.out.println("Go left");
    }
    public void right(){
        System.out.println("Go right");
    }
}