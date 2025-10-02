package com.springclone;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springclone.bean.MyBean;

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
        MyBean myBean = context.getBean(MyBean.class);
        Class<?> class1 = myBean.getClass();
        System.out.println(class1.getSimpleName());
        
        System.out.println("Spring Clone Boot finished starting!");
    }
}
