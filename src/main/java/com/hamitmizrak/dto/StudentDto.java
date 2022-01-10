package com.hamitmizrak.dto;

import lombok.*;
import lombok.extern.log4j.Log4j2;
import java.io.Serial;
import java.io.Serializable;

//lombok
@Data                // getter and setter+ hashcode+equals+toString
@AllArgsConstructor  // parametreli constructor
@NoArgsConstructor   // parametresiz constructor
@Builder             // Builder design patter
@Log4j2
public class StudentDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 4900459568984883320L;

    //@Getter @Setter
    private int studentId;
    private String studentName;
    private String studentSurname;

    public static void main(String[] args) {
       log.error("hata");
       log.warn("warn");
       log.info("info");
       log.fatal("fatal");
       log.debug("Debug");
    }
}
