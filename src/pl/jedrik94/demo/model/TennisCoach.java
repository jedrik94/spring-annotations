package pl.jedrik94.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.jedrik94.demo.service.FortuneService;

@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public void doSomeFunkyStuff(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Just do it!";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
