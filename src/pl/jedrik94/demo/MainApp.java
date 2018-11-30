package pl.jedrik94.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.jedrik94.demo.configure.ApplicationConfig;
import pl.jedrik94.demo.configure.LoggerConfig;
import pl.jedrik94.demo.model.SwimCoach;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LoggerConfig.class, ApplicationConfig.class);

        SwimCoach mainCoach = context.getBean("swimCoach", SwimCoach.class);

        System.out.println("Workout: " + mainCoach.getDailyWorkout() + " Fortune: " + mainCoach.getFortune());

        context.close();
    }
}
