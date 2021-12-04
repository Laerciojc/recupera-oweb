package com.rec.web.controller;

import com.rec.web.entity.ContasPagar;
import com.rec.web.repository.ContasPagarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/contasPagar")
public class ContasPagarController {

    @Autowired
    private ContasPagarRepository repository;

    @GetMapping
    public List<ContasPagar> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<ContasPagar> salvar(@RequestBody @Valid ContasPagar contasPagar) {
        ContasPagar nova = repository.save(contasPagar);
        return ResponseEntity.ok(nova);
    }

}
