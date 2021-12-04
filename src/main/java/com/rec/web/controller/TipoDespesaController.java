package com.rec.web.controller;

import com.rec.web.entity.TipoDespesa;
import com.rec.web.repository.PessoaRepository;
import com.rec.web.repository.TipoDespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/tipoDespesa")
public class TipoDespesaController {

    @Autowired
    private TipoDespesaRepository repository;

    @GetMapping
    public List<TipoDespesa> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<TipoDespesa> salvar(@RequestBody @Valid TipoDespesa tipoDespesa) {
        TipoDespesa nova = repository.save(tipoDespesa);
        return ResponseEntity.ok(nova);
    }

}
