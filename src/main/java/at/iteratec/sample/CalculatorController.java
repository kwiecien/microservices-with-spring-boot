package at.iteratec.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RefreshScope
public class CalculatorController {
    private final LoggingService logger;
    private static final String NAME = "kk";

    @Value("${radix}")
    private int radix;

    @Autowired
    public CalculatorController(LoggingService logger) {
        this.logger = logger;
    }

    @GetMapping("/add")
    public String add(@RequestParam String o1, @RequestParam String o2) {
        logger.log(NAME, o1 + " + " + o2);
        return Integer.toString(parseInt(o1) + parseInt(o2), radix);
    }

    @GetMapping("/sub")
    public String subtract(@RequestParam String o1, @RequestParam String o2) {
        logger.log(NAME, o1 + " - " + o2);
        return Integer.toString(parseInt(o1) - parseInt(o2), radix);
    }

    @GetMapping("/mult")
    public String multiply(@RequestParam String o1, @RequestParam String o2) {
        logger.log(NAME, o1 + " * " + o2);
        return Integer.toString(parseInt(o1) * parseInt(o2), radix);
    }

    @GetMapping("/div")
    public String divide(@RequestParam String o1, @RequestParam String o2) {
        logger.log(NAME, o1 + " / " + o2);
        return Integer.toString(parseInt(o1) / parseInt(o2), radix);
    }

    private int parseInt(@RequestParam String o1) {
        return Integer.parseInt(o1, radix);
    }
}