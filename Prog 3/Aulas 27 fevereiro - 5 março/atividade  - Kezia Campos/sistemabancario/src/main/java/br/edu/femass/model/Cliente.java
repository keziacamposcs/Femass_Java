package br.edu.femass.model;

import java.util.ArrayList;
import java.util.List;

import br.edu.femass.diversos.Validador;

public class Cliente {
    private Long id;
    private String nome;
    private String cpf;
    private String endereco;
    private List<String> telefones = new ArrayList<String>();
    private String email;

    private static Long proximoId = 0L;


    public Cliente ( String nome, String cpf, List<String> telefones) {

        if (Validador.validarCPF(cpf) == false)throw new RuntimeException("CPF inválido");
        this.cpf = cpf;

        this.nome = nome;
        this.telefones = telefones;
        this.id = proximoId++;
        proximoId++;
    }
}
