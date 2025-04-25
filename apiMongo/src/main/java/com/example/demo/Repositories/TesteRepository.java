package com.example.demo.Repositories;

import com.example.demo.Models.Teste;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TesteRepository extends MongoRepository<Teste, String> {
}
