package com.hamitmizrak.model;

import com.hamitmizrak.dto.AdminDto;
import com.hamitmizrak.dto.StudentDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;

@Controller
public class _05_queryJsp {

    //sadece ekranda göstermeye yarar
    //localhost:8080/birinciuygulama
    @GetMapping("/birinciuygulama")
    @ResponseBody
    public String getQuery(){
        return "Yükleniyor ... ";
    }

    //bir sayfaya yönlendirmek için
    //localhost:8080/ikinciuygulama
    @GetMapping("/ikinciuygulama")
    public String secondMethod() {
        return "index";
    }

    //dizin içinde dizin redirect
    //localhost:8080/ucuncuuygulama
    @GetMapping("/ucuncuuygulama")
    public String thirdMethod(){
        return "otherfile/other";
    }

    //şimdiye kadar sadece veri gösterdik artık bizde _2_query sayfasına veri göndererlim.
    //localhost:8080/dorduncuuygulama
    //@GetMapping ==> URL
    //retun ==>gidilecek sayfa
    // Model  <== Controller  ==>   View
    @GetMapping("/dorduncuuygulama")
    public String fourMethod(Model model){
        model.addAttribute("query_key","Çağrı Türkmen");
        return "_2_query";
    }

    //Modele bu sefer birden fazla obje ekleyerek _2_query.jsp sayfasında göndereceğim.
    //AdminDto ve static mesaj Model ekliyoruz Controller alıyor bunu View kısmında gösteriyor.
    //localhost:8080/besinciuygulama
    @GetMapping("/besinciuygulama")
    public String fiveMethod(Model model){
        AdminDto adminDto=AdminDto.builder().adminName("Melih").adminSurname("Dumanlı").build();
        model.addAttribute("query_admin",adminDto);
        model.addAttribute("query_key","Cemil Duman");
        return "_2_query";
    }

    //localhost:8080/altinciuygulama/4
    @GetMapping("/altinciuygulama/{param1}")
    public String sixMethod(Model model , @PathVariable(name = "param1") int id44){
        model.addAttribute("query_key","Gülten Ulukal ID: "+id44);
        return "_2_query";
    }





}
