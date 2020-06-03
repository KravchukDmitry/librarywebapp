package extrue.springframework.librarywebapp;

import extrue.springframework.librarywebapp.bootstrap.TestCustom;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class AppConfig {

    @Bean
    public BigDecimal getShit(TestCustom testCustom) {
        return BigDecimal.ONE;
    }
}
