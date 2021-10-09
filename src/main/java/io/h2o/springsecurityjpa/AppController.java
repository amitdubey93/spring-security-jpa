package io.h2o.springsecurityjpa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/")
    public String home(){
        return ("<h2>welcome</h2>");
    }

    @GetMapping("/user")
    public String user(){
        return ("<h2>welcome user</h2>");
    }

    @GetMapping("/admin")
    public String admin(){
        return ("<h2>welcome admin</h2>");
    }
}
