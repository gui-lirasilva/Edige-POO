package br.com.edige.modelo;

import java.util.Objects;

public class Autor {

    private String email;
    private String nome;
    private String biografia;


    public Autor(String email, String nome, String biografia){
        setBiografia(biografia);
        setEmail(email);
        setNome(nome);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String modeloEmail = "^([\\w\\.\\-]+)@([\\w\\-]+)((\\.(\\w){2,3})+)$";
        boolean validaEmail = email.matches(modeloEmail);

        if(!validaEmail){
            throw new IllegalArgumentException("E-mail inválido!");
        }

        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        //Validação 1
        if (nome.length() > 50){
            throw new IllegalArgumentException("Tamanho do nome superior a 50 caracteres");
        }
        //Validação 2
        if (nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome não pode ser nulo nem vazio");
        }

        this.nome = nome;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        //Validação 1
        if (biografia.length() > 250){
            throw new IllegalArgumentException("Tamanho da biografia superior a 250 caracteres");
        }
        //Validação 2
        if (biografia == null || biografia.trim().isEmpty()){
            throw new IllegalArgumentException("Nome não pode ser nulo nem vazio");
        }

        this.biografia = biografia;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.email);
    }

    @Override
    public boolean equals(Object obj) {
        Autor outroAutor = (Autor) obj;

        return this.email.equals(outroAutor.email);
    }

    @Override
    public String toString() {
        return nome;
    }
}
