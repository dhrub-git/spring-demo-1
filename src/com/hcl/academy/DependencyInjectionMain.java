package com.hcl.academy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionMain {
    public static void main(String[] args) {

        //feed the application configuration the the spring container
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve the bean from the spring container
        Coach theCoach=context.getBean("bbCoach",Coach.class);
        //Coach aplhaCoach=context.getBean("bbCoach",Coach.class);
//        FortuneService myFortune=context.getBean("myFortune",FortuneService.class);

        //use the methods from the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
