package org.hotswap.agent.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BmiAnalyzer {
    @GetMapping(value = "/bmi")
    @ResponseBody
    public String judgeBmi(@RequestParam("bmi") double bmi) {
        if ( bmi < 18.5) {
            return "营养不良";
        }
        else if(bmi >25) {
            return "超重";
        }else{
            return "正常";
        }
    }
}
