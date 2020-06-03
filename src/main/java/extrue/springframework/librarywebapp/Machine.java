package extrue.springframework.librarywebapp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "mach")
public class Machine {
    private Long power;
    private Long speed;

}
