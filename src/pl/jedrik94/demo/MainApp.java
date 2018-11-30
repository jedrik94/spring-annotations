package pl.jedrik94.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.jedrik94.demo.configure.ApplicationConfig;
import pl.jedrik94.demo.configure.LoggerConfig;
import pl.jedrik94.demo.model.PingPongCoach;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LoggerConfig.class, ApplicationConfig.class);

        PingPongCoach mainCoach = context.getBean("pingPongCoach", PingPongCoach.class);

        System.out.println("Workout: " + mainCoach.getDailyWorkout() + " Fortune: " + mainCoach.getFortune());
        System.out.println("Email: " + mainCoach.getEmail() + " Team: " + mainCoach.getTeam());

        context.close();
    }
}
