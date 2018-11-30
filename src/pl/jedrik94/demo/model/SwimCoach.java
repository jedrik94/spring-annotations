package pl.jedrik94.demo.model;

import org.springframework.beans.factory.annotation.Value;
import pl.jedrik94.demo.service.FortuneService;

public class SwimCoach implements Coach {

    private final FortuneService fortuneService;

    @Value(value = "${tennis_coach.email}")
    private String email;

    @Value(value = "${tennis_coach.team}")
    private String team;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Try not to drown!";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
