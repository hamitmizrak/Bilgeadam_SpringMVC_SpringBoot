package com.hamitmizrak.model;


import com.hamitmizrak.dto.StudentDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class _04_objectModel {

    //getMapping: url
    //return : sayfaya redirect
    @GetMapping("/studentjsp")
    public String getObject( Model model){
        StudentDto studentDto=StudentDto.
                builder()
                .studentId(44).studentName("Hamit").studentSurname("Mızrak")
                .build();

        //key-value
        model.addAttribute("message","Uzak diyarlardan geldim modelden");
        model.addAttribute("student_key",studentDto);
        return "object";
    }

}
