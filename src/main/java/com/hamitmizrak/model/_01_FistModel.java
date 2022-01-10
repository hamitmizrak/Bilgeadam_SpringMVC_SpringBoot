package com.hamitmizrak.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class _01_FistModel {

    //localhost:8080/ilkuygulama
    @GetMapping("/ilkuygulama")
    @ResponseBody
    public String firstMethod(){
        return "En sonunda artık Spring Boooooottttaaaayızzzz .";
    }


}
