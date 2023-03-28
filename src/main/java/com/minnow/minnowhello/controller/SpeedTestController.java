package com.minnow.minnowhello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpeedTestController {

    @GetMapping("/")
    public String index() {
        return "SpeedTest.html";
    }

    @GetMapping("/ping")
    @ResponseBody
    public String speedTest() {
        return "Pong!!!";
    }
}
