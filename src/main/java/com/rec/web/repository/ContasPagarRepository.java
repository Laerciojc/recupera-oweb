package com.rec.web.repository;

import com.rec.web.entity.ContasPagar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContasPagarRepository extends JpaRepository<ContasPagar,Long> {

    @Query("select c from ContasPagar c where nome = :nome order by c.id desc")
    List<ContasPagar> findByContasPagar(String nome);
}
