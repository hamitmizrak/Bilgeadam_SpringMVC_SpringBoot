package com.hamitmizrak.dto;

import java.io.Serial;
import java.io.Serializable;

public class StudentDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 4900459568984883320L;

    private int studentId;
    private String studentName;
    private String studentSurname;

    public int getStudentId() {
        return studentId;
    }

    public StudentDto setStudentId(int studentId) {
        this.studentId = studentId;
        return this;
    }

    public String getStudentName() {
        return studentName;
    }

    public StudentDto setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public StudentDto setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
        return this;
    }
}
