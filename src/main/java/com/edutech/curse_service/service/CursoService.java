package com.edutech.curse_service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutech.curse_service.model.Curso;
import com.edutech.curse_service.repository.CursoRepository;

import jakarta.persistence.EntityNotFoundException;

@Service

public class CursoService {
    @Autowired
    private CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<Curso> getAllCursos() {
        return cursoRepository.findAll();
    }

    public Optional<Curso> getCursoById(Long id) {
        return cursoRepository.findById(id);
    }

    public Curso createCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public void deleteCurso(Long id) {
        cursoRepository.deleteById(id);
    }

    public Curso updateCurso(Long id, Curso cursoDetails) {
        Curso curso = cursoRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Curso no encontrado con id: "+ id));

        curso.setNombreCurso(cursoDetails.getNombreCurso());
        curso.setDescripcion(cursoDetails.getDescripcion());
        curso.setModalidad(cursoDetails.getModalidad());
        curso.setCupoMaximo(cursoDetails.getCupoMaximo());
        curso.setIdProfesor(curso.getIdProfesor());
        curso.setIdMateria(curso.getIdMateria());

        return cursoRepository.save(curso);
    }

}
