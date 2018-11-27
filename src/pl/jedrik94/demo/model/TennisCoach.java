package pl.jedrik94.demo.model;

import org.springframework.stereotype.Component;

@Component(value = "myTennisCoach")
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Just do it!";
    }
}
