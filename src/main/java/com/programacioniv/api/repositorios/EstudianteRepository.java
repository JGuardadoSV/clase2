package com.programacioniv.api.repositorios;

import com.programacioniv.api.entidades.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
// <Estudiante, Integer> Entidad , Tipo de datos de la llave primaria
public interface EstudianteRepository extends JpaRepository<Estudiante,Integer> {

}
