package pl.jedrik94.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pl.jedrik94.demo.service.FortuneService;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

    @Value(value = "${tennis_coach.email}")
    private String email;

    @Value(value = "${tennis_coach.team}")
    private String team;

    private final FortuneService fortuneService;

    @Autowired
    public TennisCoach(@Qualifier(value = "fileFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
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
