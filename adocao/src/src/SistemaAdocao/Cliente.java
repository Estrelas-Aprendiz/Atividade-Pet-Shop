package SistemaAdocao;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private int idade;
    private char sexo;

    public Cliente(String nome, String cpf, String endereco, int idade, char sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.idade = idade;
        this.sexo = sexo;
    }


}
