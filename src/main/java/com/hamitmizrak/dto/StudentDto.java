package com.hamitmizrak.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data               //getter and setter+ hashcode+equals+toString
@AllArgsConstructor //parametreli constructor
@NoArgsConstructor  //parametresiz constructor
@Builder            //Builder design patter
public class StudentDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 4900459568984883320L;

    private int studentId;
    private String studentName;
    private String studentSurname;
}
