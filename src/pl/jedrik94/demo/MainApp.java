package pl.jedrik94.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.jedrik94.demo.configure.ApplicationConfig;
import pl.jedrik94.demo.model.TennisCoach;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        TennisCoach mainCoach = context.getBean("tennisCoach", TennisCoach.class);
        TennisCoach secondCoach = context.getBean("tennisCoach", TennisCoach.class);

        boolean comparisonOfTennisCoachInstances = (mainCoach == secondCoach);

        System.out.println("Q: Do mainCoach and secondCoach point to the same memory location? A: " + comparisonOfTennisCoachInstances);

        context.close();
    }
}
