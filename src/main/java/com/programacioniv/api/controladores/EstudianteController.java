package com.programacioniv.api.controladores;


import com.programacioniv.api.entidades.Estudiante;
import com.programacioniv.api.repositorios.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EstudianteController {

    //Inyectar dependencia EstudianteRepository
    @Autowired
    EstudianteRepository repo;

    //********************************************************************
    @GetMapping("inicio") //GET
    @ResponseBody
    public Estudiante inicio()
    {
        Estudiante estudiante;
        estudiante=repo.findById(1).get();

        return estudiante;
    }

    //********************************************************************
    @PostMapping("/registrar") //POST
    @ResponseBody
    public Estudiante nuevo(@RequestBody Estudiante estudiante) {
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
