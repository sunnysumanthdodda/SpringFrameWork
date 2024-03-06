package com.springframework.learnspringframework.springbasicconcept;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorld {
	public static void main(String[] args) throws BeansException {

		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("address"));
		System.out.println(context.getBean("address2"));
		System.out.println(context.getBean("address3"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2"));
		System.out.println(context.getBean("person3"));
		System.out.println(context.getBean(Address.class));
		System.out.println(context.getBean(Person.class));
		System.out.println();
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}
}