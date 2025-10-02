package com.springclone;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringCloneApplication {

    public static void run(Class<?> mainClass, String[] args) {
        System.out.println("Booting class: " + mainClass.getName());

        String basePackage = mainClass.getPackageName();
        System.out.println(basePackage);
        //Create the IoC container
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        //  Register mainClass (acts like a config class)
        context.register(mainClass);
        context.scan(basePackage);
        
        //  Refresh container to initialize beans
        context.refresh();
        String[] beans = context.getBeanDefinitionNames();
        for (String name : beans) {
            System.out.println("bean name:"+name);
        }
        
        System.out.println("Spring Clone Boot finished starting!");
    }
}
