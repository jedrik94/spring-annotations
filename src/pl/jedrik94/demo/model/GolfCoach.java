package pl.jedrik94.demo.model;

import org.springframework.stereotype.Component;

@Component
public class GolfCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Take your metal rod and hit those balls!";
    }

    @Override
    public String getFortune() {
        return "There is NO fortune service. So there is NO fortune.";
    }
}