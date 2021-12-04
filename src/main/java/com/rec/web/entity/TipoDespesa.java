package com.rec.web.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class TipoDespesa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String name;

    @OneToMany(mappedBy = "tipoDespesa", cascade = CascadeType.ALL)
    private List<ContasPagar> contasPagar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ContasPagar> getContasPagar() {
        return contasPagar;
    }

    public void setContasPagar(List<ContasPagar> contasPagar) {
        this.contasPagar = contasPagar;
    }
}
