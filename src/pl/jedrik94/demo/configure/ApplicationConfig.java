package pl.jedrik94.demo.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import pl.jedrik94.demo.model.Coach;
import pl.jedrik94.demo.model.PingPongCoach;
import pl.jedrik94.demo.service.ChinaFortuneService;
import pl.jedrik94.demo.service.FortuneService;

@Configuration
@PropertySource(value = "classpath:sport.properties")
public class ApplicationConfig {

    @Bean
    public FortuneService chinaFortuneService() {
        return new ChinaFortuneService();
    }

    @Bean
    public Coach pingPongCoach() {
        return new PingPongCoach(chinaFortuneService());
    }
}
