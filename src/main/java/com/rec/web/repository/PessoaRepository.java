package com.rec.web.repository;

import com.rec.web.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    @Query("select p from Pessoa p inner join fetch p.contasPagar ")
    List<Pessoa> findAllWithContasPagar();

}
