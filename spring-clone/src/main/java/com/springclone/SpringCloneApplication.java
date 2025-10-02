package com.springclone;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringCloneApplication {

    public static void run(Class<?> mainClass, String[] args) {
        System.out.println("Booting class: " + mainClass.getName());

        //Create the IoC container
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        //  Register mainClass (acts like a config class)
        context.register(mainClass);

        //  Refresh container to initialize beans
        context.refresh();

        System.out.println("Spring Clone Boot finished starting!");
    }
}
