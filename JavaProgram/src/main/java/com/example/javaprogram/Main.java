package com.example.javaprogram;

import TestClasses.Person;
import TestClasses.Emotions;
import TestClasses.Position;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Main implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("hello");

        Person p1 = new Person("Emanuel",19, Position.LAYING, Emotions.HAPPY);

        System.out.println(p1);
    }

}
