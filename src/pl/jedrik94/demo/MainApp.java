package pl.jedrik94.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.jedrik94.demo.model.TennisCoach;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        TennisCoach mainCoach = context.getBean("tennisCoach", TennisCoach.class);

        System.out.println(mainCoach.getDailyWorkout());
        System.out.println(mainCoach.getFortune());

        System.out.println(mainCoach.getEmail());
        System.out.println(mainCoach.getTeam());

        context.close();
    }
}
