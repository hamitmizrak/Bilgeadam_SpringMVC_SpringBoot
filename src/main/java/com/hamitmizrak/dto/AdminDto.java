package com.hamitmizrak.dto;

import lombok.*;
import lombok.extern.log4j.Log4j2;

import java.io.Serial;
import java.io.Serializable;

@Log4j2
@ToString
@EqualsAndHashCode
@Builder
public class AdminDto implements Serializable {
    @Serial
    private static final long serialVersionUID = -5150750902212523040L;

    @Getter @Setter
    private String adminName;

    @Getter @Setter
    private String adminSurname;

    //parametresiz constructur
    public AdminDto() {
        this.adminName="admin adı yazmadınız";
        this.adminSurname="admin soyadı yazmadınız";
    }

    //parametreli constructur
    public AdminDto(String adminName, String adminSurname) {
        this.adminName = adminName;
        this.adminSurname = adminSurname;
    }


}
