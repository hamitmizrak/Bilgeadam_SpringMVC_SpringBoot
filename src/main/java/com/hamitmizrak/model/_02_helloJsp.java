package com.hamitmizrak.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class _02_helloJsp {

    @GetMapping("/jsp")
    public String getJspMethod() {
        return "index";
    }
}
