package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("person.xml");
        Person person = (Person) ap.getBean("re");
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}