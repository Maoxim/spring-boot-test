package org.hotswap.agent.example.springboot;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestRest {
    @GetMapping(value = "/hello")
    @ResponseBody
    public String hello() {
        return "hello2";
    }


    @GetMapping(value = "/salary")
    @ResponseBody
    public String salary(@RequestParam("age") int age) {
        if (age > 10 ) {
            return "100";
        } else if (age > 5) {
            return "50";
        } else {
            return "25";
        }
    }
}
