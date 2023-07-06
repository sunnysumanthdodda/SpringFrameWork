package com.springframework.learnspringframework.javagamingbasic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MarioGameQualifier")
public class MarioGame implements GamingConsole {

    public void up(){
        System.out.println("Go long");
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