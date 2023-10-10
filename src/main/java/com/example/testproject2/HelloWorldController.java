package com.example.testproject2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping
    @ResponseBody
    public String helloWorld()
    {
        return "Hello World Murugan";
    }

    @RequestMapping("goodbye")
    public String goodBye()
    {
        return "GoodBye Murugan";
    }
}
