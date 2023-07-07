package com.springframework.advancedfeatures.lazyinitialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
class ClassA{

}

@Component
@Lazy
class ClassB{
    ClassA classA;
    public ClassB(ClassA classA){
        System.out.println("Some Initialization Logic");
        this.classA = classA;
    }

    public void doSomething(){
        System.out.println("Do Something");
    }
}

@Configuration
@ComponentScan
public class LazyInitialization {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(LazyInitialization.class)) {

            System.out.println("Lazy Initialization is completed");
            context.getBean(ClassB.class).doSomething();
        }
    }
}
