package com.hamitmizrak.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class _03_otherJsp {

    @GetMapping("/otherpage")
    public String getJspMethod() {
        return "otherfile/other";
    }
}
