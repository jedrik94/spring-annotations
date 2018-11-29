package pl.jedrik94.demo.service;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private List<String> fortunes;
    private final Random randomNumberGenerator;

    public RandomFortuneService() {
        randomNumberGenerator = new Random();
        fillFortuneList();
    }

    @Override
    public String getFortune() {
        int randomIndex = randomNumberGenerator.nextInt(fortunes.size());
        return fortunes.get(randomIndex);
    }

    private void fillFortuneList() {
        fortunes = Arrays.asList(
                "Be aware of cats!",
                "I see a ladder as your next opponent.",
                "U stink! Get lost!"
        );
    }
}
