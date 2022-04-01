package me.pedroeugenio.solid.model;

import java.math.BigDecimal;

public class Terceirizado extends Funcionario {

    private DadosPessoais dadosPessoais;
    private String empresa;


    public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        super(nome, cpf, cargo, salario);
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }
}
