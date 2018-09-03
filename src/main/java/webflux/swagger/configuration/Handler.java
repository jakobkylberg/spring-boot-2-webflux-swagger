package webflux.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import webflux.swagger.handler.IntegerHandler;

@Configuration
public class Handler {

    @Bean
    public IntegerHandler integerHandler() {
        return new IntegerHandler();
    }

}
