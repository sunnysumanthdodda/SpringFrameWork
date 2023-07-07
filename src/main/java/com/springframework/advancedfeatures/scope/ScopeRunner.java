package com.springframework.advancedfeatures.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA{

}

@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class ClassB{

}
@Configuration
@ComponentScan
public class ScopeRunner {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(ScopeRunner.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(ClassA.class));
            System.out.println(context.getBean(ClassA.class));
            System.out.println(context.getBean(ClassA.class));
            System.out.println();
            System.out.println(context.getBean(ClassB.class));
            System.out.println(context.getBean(ClassB.class));
            System.out.println(context.getBean(ClassB.class));
            System.out.println(context.getBean(ClassB.class));
            System.out.println(context.getBean(ClassB.class));
        }
    }
}
