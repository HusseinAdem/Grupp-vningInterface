package com.example.javaprogram;

import TestClasses.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Main implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("hello");

        Person p1 = new Person("Emanuel",19, Position.LAYING, Emotions.HAPPY);

        System.out.println(p1);

        //alternativ 1 robot säger hej och sitter
        Robot robot1 = new Robot("Robotek1");

        sayHello(robot1);
        sitDown(robot1);
        sayGoodbye(robot1);



        //alternativ 2 robot säger hej och sitter
        Greetable robot22 = new Robot("Robotek2");
        sayHello(robot22);


        Movable robot2 = new Robot("Robotek2");
        sitDown(robot2);

        sayGoodbye(robot22);




    }
    public static void sitDown(Movable r){
        r.toSitDown();
    }
    public static void sayHello(Greetable g){
        g.sayhello();
    }
    public static void sayGoodbye(Greetable g){
        g.sayGoodbye();

    }

}
