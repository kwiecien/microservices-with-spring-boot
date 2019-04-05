package at.iteratec.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleResource {
    private Logger logger = LoggerFactory.getLogger(SampleResource.class);

    @GetMapping("/api/helloWorld")
    public String helloWorld() {
        logger.debug("helloWorld has been called.");
        return "Hello World!";
    }
}