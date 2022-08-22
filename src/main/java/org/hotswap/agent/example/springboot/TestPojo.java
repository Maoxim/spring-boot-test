package org.hotswap.agent.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestPojo {
    @GetMapping(value = "/version")
    @ResponseBody
    public String version(){
        String a="hello",b="hi";
        if(a.compareTo(b)==1)
            return "hello > hi";
        else
            return "hi>hello";
    }

    @GetMapping(value = "/slove")
    @ResponseBody
    public String slove() {
        int number = 10;
        if (number >= 10 ) {
            return "true";
        } else {
            return "false";
        }
    }
}
