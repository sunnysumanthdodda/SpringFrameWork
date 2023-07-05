package com.example.learnspringframework.springbasicconcept;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person(String name, int age, Address address) { }
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
    public Address address(){
        return new Address("123 Sigma Rd","TX");
    }

    @Bean
    public Address address2(){
        return new Address("123 MacArthur Dr","TX");
    }

    @Bean
    @Primary
    public Address address3(){
        return new Address("Baker St","London");
    }
    @Bean
    public Person person(){
        return new Person(name(),age(),address());
    }

    @Bean
    @Primary
    public Person person2(Address address2){
        return new Person("John Wick",40,address2);
    }

    @Bean
    public Person person3(Address address3){
        return new Person("Sherlock Holmes",40,address3);
    }

}