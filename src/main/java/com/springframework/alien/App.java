package com.springframework.alien;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        try(var context = new ClassPathXmlApplicationContext("alien.xml")){
            Alien alien = (Alien) context.getBean("alien");
            alien.compile();

//            Desktop desktop = (Desktop) context.getBean("desktop");
//            desktop.compile();
//
//            Laptop laptop = (Laptop) context.getBean("laptop");
//            laptop.compile();

            Computer computer = context.getBean(Computer.class);
            computer.compile();
        }
    }
}
