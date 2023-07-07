package com.springframework.advancedfeatures.preconstructanddestroy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
class SomeClass{
    SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency){
        super();
        this.someDependency = someDependency;
        System.out.println("All dependencies are ready..!");
    }

    @PostConstruct
    public void initialize(){
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanUp(){
        System.out.println("Clean UP..!");
    }
}

@Component
class SomeDependency{

    public void getReady() {
        System.out.println("Some logic using SomeDependency");
    }
}

@ComponentScan
public class PreConstructandDestroy {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(PreConstructandDestroy.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
