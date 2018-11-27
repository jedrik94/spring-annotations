package pl.jedrik94.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.jedrik94.demo.model.Coach;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach mainCoach = context.getBean("myTennisCoach", Coach.class);

        System.out.println(mainCoach.getDailyWorkout());

        context.close();
    }
}
