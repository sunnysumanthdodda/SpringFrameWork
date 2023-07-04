package com.example.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(String name, int age) { }
record Address(String firstLine, String city) { }
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Sunny Sumanth Dodda";
    }
    @Bean
    public int age(){
        return 25;
    }
    @Bean
    public Person person(){
        return new Person("John Wick",40);
    }
    @Bean
    public Address address(){
        return new Address("123 Alma Rd","VA");
    }
}