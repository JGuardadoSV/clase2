package com.programacioniv.api.controladores;


import com.programacioniv.api.entidades.Estudiante;
import com.programacioniv.api.repositorios.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EstudianteController {

    //Inyectar dependencia EstudianteRepository
    @Autowired
    EstudianteRepository repo;

    //********************************************************************
    @GetMapping("todos") //GET
    @ResponseBody
    public List<Estudiante> todos()
    {
        return repo.findAll();
    }

    @GetMapping("uno/{id}") //GET
    @ResponseBody
    public Estudiante uno(@PathVariable  int id)
    {
        return repo.findById(id).get();
    }


    //********************************************************************
    @PostMapping("/registrar") //POST
    @ResponseBody
    public Estudiante nuevo(@RequestBody Estudiante estudiante) {
        repo.save(estudiante);
        return estudiante;
    }


    //*************************************
    //DELETE

    @DeleteMapping("/eliminar/{id}") //POST localhost/estudiantes/eliminar/1
    @ResponseBody
    public Estudiante eliminar(@PathVariable  int id) {
        Estudiante e = repo.findById(id).get(); // lo buscamos
        repo.delete(e);
        return e;
    }
    //Actualizar

    @PutMapping ("/actualizar") //PUT
    @ResponseBody
    public Estudiante actualizar(@RequestBody Estudiante estudiante) {
        repo.save(estudiante);
        return estudiante;
    }





    /*
    *
    * {
    "nombre": "Juan Perez"
    "direccion":"Chalatenango
}
    *
    *
    * */



}
