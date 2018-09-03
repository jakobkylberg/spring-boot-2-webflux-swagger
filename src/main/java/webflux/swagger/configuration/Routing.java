package webflux.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import webflux.swagger.handler.IntegerHandler;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class Routing {

    @Bean
    public RouterFunction<ServerResponse> integerEndpointRouting(final IntegerHandler integerHandler) {
        return route(GET("/api/integer"), integerHandler::getInteger);
    }

}
