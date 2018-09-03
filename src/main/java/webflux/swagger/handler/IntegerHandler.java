package webflux.swagger.handler;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

public class IntegerHandler {

    public Mono<ServerResponse> getInteger(final ServerRequest request) {
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(new IntegerResponse(1)), IntegerResponse.class);
    }

}
