package com.springframework.advancedfeatures.xmlconfiguration;

import com.springframework.learnspringframework.javagamingbasic.GameRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
public class XMLConfigurationLaunchApplication {
    public static void main(String[] args) {
        try (var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("scopeRunner"));
            System.out.println(context.getBean("scopeRunner"));
            System.out.println(context.getBean("scopeRunner"));
            context.getBean(GameRunner.class).run();
        }
    }
}