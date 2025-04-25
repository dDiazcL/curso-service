package com.edutech.curse_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class Curso {

    private Long idCurso;
    
    private String nombreCurso;
    private String descricion;
    private String modalidad; //Presencial, online, hibrida.
    private int cupoMaximo;

    private Long idProfesor;
    private Long idMateria;

}
