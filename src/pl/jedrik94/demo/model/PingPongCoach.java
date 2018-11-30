package pl.jedrik94.demo.model;

import org.springframework.beans.factory.annotation.Value;
import pl.jedrik94.demo.service.FortuneService;

public class PingPongCoach implements Coach {

    private final FortuneService fortuneService;

    @Value(value = "${ping_pong_coach.email}")
    private String email;

    @Value(value = "${ping_pong_coach.team}")
    private String team;

    public PingPongCoach(FortuneService fortuneService) {
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
        return "Pinging 8.8.8.8 with 32 bytes of data:\n" +
                "Reply from 8.8.8.8: bytes=32 time=10ms TTL=119";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
