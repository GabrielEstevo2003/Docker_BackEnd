package com.example.demo.Services;

import com.example.demo.Models.Teste;
import com.example.demo.Repositories.TesteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TesteService {

    @Autowired
    private TesteRepository testeRepository;

    public Teste insert (Teste teste){
        return testeRepository.save(teste);
    }

    public List<Teste> findAll(){
        return testeRepository.findAll();
    }

    public Optional<Teste> findById(String id){
        return testeRepository.findById(id);
    }

    public void deleteById(String id){
        testeRepository.deleteById(id);
    }
}
