package dio.dio_sring_security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome(){
        return "Welcome to My Spring Boot Web API";
    }
    @GetMapping("/USERS")
    public String users() {
        return "Authorized user";
    }
    @GetMapping("/MANAGERS")
    public String managers() {
        return "Authorized manager";
    }
}