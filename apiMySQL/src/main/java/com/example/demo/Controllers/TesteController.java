package com.example.demo.Controllers;

import com.example.demo.Models.Teste;
import com.example.demo.Repositories.TesteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/testeDocker")
public class TesteController {
    @Autowired
    private TesteRepository testeRepository;

    @PostMapping
    public Teste insert(@RequestBody Teste teste){
        return testeRepository.save(teste);
    }

    @GetMapping
    public List<Teste> findAll(){
        return testeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Teste> findById(@PathVariable("id") Long id){
        return testeRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id")Long id){
        testeRepository.deleteById(id);
    }
}
