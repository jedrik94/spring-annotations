package pl.jedrik94.demo.model;

import pl.jedrik94.demo.service.FortuneService;

public class SwimCoach implements Coach {
    private final FortuneService fortuneService;

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
