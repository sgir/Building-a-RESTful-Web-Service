package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping(method= RequestMethod.GET, value = "/greeting")
    public Greeting getGreeting(){

        

        return Greeting;
    }
}
