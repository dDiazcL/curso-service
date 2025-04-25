package com.edutech.curse_service.model.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@EntityScan
@Data
public class CursoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCurso;

    private String nombreCurso;
    private String descripcion;
    private String modalidad;
    private int cupoMaximo;
    private Long idProfesor;
    private Long idMateria;

}
