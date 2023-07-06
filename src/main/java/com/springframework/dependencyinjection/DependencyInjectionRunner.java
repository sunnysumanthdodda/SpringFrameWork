package com.springframework.dependencyinjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class DependencyInjectionRunner {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(DependencyInjectionRunner.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(DependencyInjectionFieldBased.class));
            System.out.println(context.getBean(DependencyInjectionSetterBased.class));
            System.out.println(context.getBean(DependencyInjectionConstructorBased.class));
        }
    }
}
