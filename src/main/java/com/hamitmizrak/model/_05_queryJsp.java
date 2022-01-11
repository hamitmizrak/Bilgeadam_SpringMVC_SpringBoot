package com.hamitmizrak.model;

import com.hamitmizrak.dto.AdminDto;
import com.hamitmizrak.dto.StudentDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;

@Controller
public class _05_queryJsp {

    //sadece ekranda göstermeye yarar
    //localhost:8080/birinciuygulama
    @GetMapping("/birinciuygulama")
    @ResponseBody
    public String getQuery() {
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
    public String thirdMethod() {
        return "otherfile/other";
    }

    //şimdiye kadar sadece veri gösterdik artık bizde _2_query sayfasına veri göndererlim.
    //localhost:8080/dorduncuuygulama
    //@GetMapping ==> URL
    //retun ==>gidilecek sayfa
    // Model  <== Controller  ==>   View
    @GetMapping("/dorduncuuygulama")
    public String fourMethod(Model model) {
        model.addAttribute("query_key", "Çağrı Türkmen");
        return "_2_query";
    }

    //Modele bu sefer birden fazla obje ekleyerek _2_query.jsp sayfasında göndereceğim.
    //AdminDto ve static mesaj Model ekliyoruz Controller alıyor bunu View kısmında gösteriyor.
    //localhost:8080/besinciuygulama
    @GetMapping("/besinciuygulama")
    public String fiveMethod(Model model) {
        AdminDto adminDto = AdminDto.builder().adminName("Melih").adminSurname("Dumanlı").build();
        model.addAttribute("query_admin", adminDto);
        model.addAttribute("query_key", "Cemil Duman");
        return "_2_query";
    }

    //////////////////////////////PATHVARIABLE/////////////////////////////////////////////////////////////
    //url yazacağım sayıyı çalıştırmak @PathVariable çalışmasını sağladım
    //localhost:8080/altinciuygulama/4
    @GetMapping("/altinciuygulama/{param1}")
    public String sixMethod(Model model, @PathVariable(name = "param1") int id44) {
        model.addAttribute("query_key", "Gülten Ulukal ID: " + id44);
        return "_2_query";
    }

    //eğer opsiyonel olara seçim yapacaksasm olsun yada olmasında burada primitive yerine Wrapper class kullanalım
    //çünkü Wrapper class null değer alabilir ancak primitive type null alamaz.
    //Wrapper =Serileştirme yapabiliriz Primitive=Serileştirme yapamayız.
    //localhost:8080/yedinciuygulama <== veya ==> localhost:8080/yedinciuygulama//77
    @GetMapping({"yedinciuygulama", "yedinciuygulama/{param2}"})
    public String sevenMethod(Model model, @PathVariable(name = "param2", required = false) Long id23) {
        if (id23 != null) {
            model.addAttribute("query_key", " Görkem Sönmez ID: " + id23);
        } else {
            model.addAttribute("query_key", " Data Yok ID: ");
        }
        return "_2_query";
    }

    //////////////////////////////REQUESTPARAMETER/////////////////////////////////////////////////////////////
    //localhost:8080/sekinciuygulama?param3=3
    @GetMapping("/sekinciuygulama")
    public String eightMethod(Model model, @RequestParam(name = "param3") long id55) {
        model.addAttribute("query_key", "Mert Can Aydın " + id55);
        return "_2_query";
    }

    //localhost:8080/dokuzuncuuygulama
   // http://localhost:8080/dokuzuncuuygulama?param4=66633
    //@ResponseBody
    //required = true ==>
    @GetMapping("/dokuzuncuuygulama")
    public String nineMethod(
            Model model,
            @RequestParam(name = "param4", required = false, defaultValue = "55") Long sayi) {

        model.addAttribute("query_key", "Java Spring Boot" + sayi);
        return "_2_query";
    }


}
