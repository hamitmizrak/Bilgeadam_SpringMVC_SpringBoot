package com.hamitmizrak.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class _03_otherJsp {

    @GetMapping("/otherpage")
    public String getJspMethod1() {
        return "otherfile/other";
    }

    @GetMapping("/other/diffucultPAGE")
    public String getJspMethod2() {
        return "otherfile/other";
    }


}
