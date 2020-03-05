package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PersoneController {

    @Autowired
    private PersonneRepository repository;

    @GetMapping("/findAll")
    public void findAllPersonne(){
       repository.findAll();
    }

   /* @GetMapping("/findById/{id}")
    public Optional<Personne> postPersonne(@PathVariable Long id){
        return repository.findById(id);
    }*/






}
