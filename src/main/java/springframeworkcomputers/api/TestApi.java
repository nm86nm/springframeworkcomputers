package springframeworkcomputers.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello";
    }
}
