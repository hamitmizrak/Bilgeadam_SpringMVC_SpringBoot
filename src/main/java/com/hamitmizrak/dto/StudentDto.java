package com.hamitmizrak.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serial;
import java.io.Serializable;

@Data               //getter and setter+ hashcode+equals+toString
@AllArgsConstructor //parametreli constructor
@NoArgsConstructor  //parametresiz constructor
@Builder            //Builder design patter

//@Log4j2

public class StudentDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 4900459568984883320L;

    private static Logger log = LoggerFactory.getLogger(StudentDto.class);
    // Lombok için
    // private static final org.apache.logging.log4j.Logger log =
    // org.apache.logging.log4j.LogManager.getLogger(StudentDto.class);

    private int studentId;
    private String studentName;
    private String studentSurname;

    public static void main(String[] args) {
        log.error("Merhabalar");
        log.info("info");
        log.warn("warn");
    }
}
