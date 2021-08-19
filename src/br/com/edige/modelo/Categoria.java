package br.com.edige.modelo;

import java.time.LocalDate;

public class Categoria {

    private String nome;
    LocalDate dataDeCadastro;

    public Categoria(String nome){
        setNome(nome);

        dataDeCadastro = LocalDate.now();
    }

    public void setNome(String nome) {

        if (nome.length() > 30){
            throw new IllegalArgumentException("Tamanho do nome superior a 30 caracteres");
        }

        if(nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("O nome não pode ser Nulo");
        }

        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataDeCadastro() {
        return dataDeCadastro;
    }

    @Override
    public String toString() {
        return nome;
    }
}
