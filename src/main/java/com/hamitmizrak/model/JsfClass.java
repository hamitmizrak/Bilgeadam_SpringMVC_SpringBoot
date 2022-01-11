package com.hamitmizrak.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.ManagedBean;
//import javax.faces.bean.SessionScoped;

@ManagedBean(value = "bilgeadam_jsf")
//@SessionScoped
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JsfClass {

    private String name = "Hamit M.";


}
