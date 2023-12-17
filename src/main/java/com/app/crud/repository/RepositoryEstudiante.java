package com.app.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.crud.entidades.Estudiante;

@Repository
public interface RepositoryEstudiante extends JpaRepository<Estudiante, Long> {

}
