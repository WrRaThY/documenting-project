package priv.rdo.example.documentation.webapp.endpoint;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.UUID;

@Slf4j
@RestController
@RequestMapping(value = "/api")
class EndpointDocumentedWithSwagger {
    private final Random random;

    EndpointDocumentedWithSwagger() {
        random = new Random();
    }

    @GetMapping("random-numbers/integers")
    RandomResponse randomResponse() {
        log.info("generating next random int");
        return new RandomResponse(random.nextInt(), UUID.randomUUID().toString());
    }
}
