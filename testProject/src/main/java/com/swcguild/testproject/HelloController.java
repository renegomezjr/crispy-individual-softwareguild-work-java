package com.swcguild.testproject;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({"/hello"})
public class HelloController {
        
    public HelloController() {
    }
    
    @RequestMapping(value="/sayhi", method=RequestMethod.GET)
    public String sayHi(Map<String, Object> model) {
        model.put("message", "Hello from the controller" );
        model.put("tip", "Tip for life" );
        return "hello";
    }
}
