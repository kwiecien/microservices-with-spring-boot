package at.iteratec.sample;

import io.swagger.models.auth.In;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CalculatorController {
    private Logger logger = LoggerFactory.getLogger(CalculatorController.class);

    @GetMapping("/add")
    public String add(@RequestParam int o1, @RequestParam int o2) {
        return Integer.toString(o1 + o2);
    }

    @GetMapping("/sub")
    public String subtract(@RequestParam int o1, @RequestParam int o2) {
        return Integer.toString(o1 - o2);
    }

    @GetMapping("/mult")
    public String multiply(@RequestParam int o1, @RequestParam int o2) {
        return Integer.toString(o1 * o2);
    }

    @GetMapping("/div")
    public String divide(@RequestParam int o1, @RequestParam int o2) {
        return Double.toString(o1 * 1.0 / o2);
    }
}