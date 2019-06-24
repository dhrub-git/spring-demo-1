package com.hcl.academy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoachMainApp {
    public static void main(String[] args) {
        //supply the application context to the spring container
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve the bean from spring container
        BaseballCoach theCoach=context.getBean("bbCoach",BaseballCoach.class);

        //use the methods
        System.out.println(theCoach.getDailyWorkout());

        //close the context
        context.close();
    }
}
