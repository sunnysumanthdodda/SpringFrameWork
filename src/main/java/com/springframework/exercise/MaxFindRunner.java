package com.springframework.exercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MaxFindRunner {
    public static void main(String[] args) {

        try(var number = new AnnotationConfigApplicationContext(MaxFindRunner.class)){
            System.out.println("Maximum number is : "+number.getBean(BusinessCalculationService.class).findMax());
        }
    }
}
