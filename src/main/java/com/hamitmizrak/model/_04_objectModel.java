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
        StudentDto studentDto=new StudentDto();
        studentDto.setStudentId(44);
        studentDto.setStudentName("Hamit");
        studentDto.setStudentSurname("Mızrak");

        //key-value
        model.addAttribute("message","Uzak diyarlardan geldim modelden");
        model.addAttribute("student_key",studentDto);
        return "object";
    }

}
