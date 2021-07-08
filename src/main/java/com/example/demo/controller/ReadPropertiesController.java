package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Controller;

@RestController
public class ReadPropertiesController {

    @Value("${name}")
    private String name;

    @RequestMapping("/echo")
    public String echo(@RequestParam String id, @RequestParam(value = "cls", defaultValue = "100") String cls) {
        return "echo: " + name + id + "-" + cls;
    }

}
