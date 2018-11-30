package pl.jedrik94.demo.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import pl.jedrik94.demo.model.Coach;
import pl.jedrik94.demo.model.SwimCoach;
import pl.jedrik94.demo.service.FortuneService;
import pl.jedrik94.demo.service.SadFortuneService;

@Configuration
@PropertySource(value = "classpath:sport.properties")
public class ApplicationConfig {

    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }
}
