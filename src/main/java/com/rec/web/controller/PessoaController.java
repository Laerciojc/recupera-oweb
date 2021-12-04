package com.rec.web.controller;

import com.rec.web.entity.Pessoa;
import com.rec.web.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {


    @Autowired
    private PessoaRepository repository;

    @GetMapping
    public List<Pessoa> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<Pessoa> salvar(@RequestBody @Valid Pessoa pessoa) {
        Pessoa nova = repository.save(pessoa);
        return ResponseEntity.ok(nova);
    }
}
