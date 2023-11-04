package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ExampleController {
    private final RestTemplate svcBClient;
    public ExampleController(@Qualifier("svc-b-client") RestTemplate svcBClient) {
        this.svcBClient = svcBClient;
    }
    @GetMapping("/api")
    public String getData() {
        return "Data from service B: " + svcBClient.getForObject("http://spring-svc-b/api", String.class);
    }
}
