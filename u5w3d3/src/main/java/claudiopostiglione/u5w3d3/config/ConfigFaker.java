package claudiopostiglione.u5w3d3.config;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Configuration
public class ConfigFaker {
    @Bean
    public Faker getFaker(){
        return new Faker(Locale.ITALY);
    }
}
