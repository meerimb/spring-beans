package peaksoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import peaksoft.model.Dog;
import peaksoft.model.Timer;

@Configuration
@ComponentScan(basePackages = "peaksoft")
public class AppConfig {
    @Bean
    public Dog dog(){
        return new Dog();
    }

    @Bean
    public Timer timer(){
        return new Timer();
    }


}
