package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private final static String templateString = "Hello, %S!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method= RequestMethod.GET, value = "/greeting")
    public Greeting getGreeting(@RequestParam(value = "name",defaultValue = "World") String name){
        return new Greeting(counter.getAndIncrement(), String.format(templateString,name));
    }
}
