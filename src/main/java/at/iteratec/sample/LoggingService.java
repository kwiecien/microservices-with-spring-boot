package at.iteratec.sample;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "logging")
public interface LoggingService {
    @PostMapping("/api/log/{name}")
    void log(@PathVariable String name, @RequestBody String expression);
}
