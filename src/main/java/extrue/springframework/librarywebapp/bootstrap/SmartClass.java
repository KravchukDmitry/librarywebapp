package extrue.springframework.librarywebapp.bootstrap;

import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Primary
@Component
public class SmartClass implements TestCustom {
    @Override
    @Scheduled(initialDelay = 1, fixedDelay = 2000)
    public void doSomeThing() {
        System.out.println("123");
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject("https://javarush.ru/groups/posts/2147-hashset-v-java", String.class);
        System.out.println(response);
    }
}
