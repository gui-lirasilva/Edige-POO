package br.com.edige.modelo;

import java.math.BigDecimal;

public class Livro {

    private String titulo;
    private String isbn;
    private String resumo;
    private String sumario;
    private Integer numeroDePaginas;
    private Autor autor;
    private String categoria;
    private BigDecimal preco;

    public Livro(String titulo, String isbn, String resumo, String sumario, Integer numeroDePaginas, Autor autor, String categoria,BigDecimal preco){
        setTitulo(titulo);
        setIsbn(isbn);
        setResumo(resumo);
        setSumario(sumario);
        setNumeroDePaginas(numeroDePaginas);
        this.autor = autor;
        this.categoria = categoria;
        this.preco = preco;
    }


    public void setTitulo(String titulo) {
        if(titulo.length() > 250){
            throw new IllegalArgumentException("Tamanho superior a 250 caracteres");
        }
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Não pode receber nulo ou espaço vazio");
        }

        this.titulo = titulo;
    }


    public void setIsbn(String isbn) { //validação diferente
        boolean validaIsbn = isbn.startsWith("978");

        if (!validaIsbn){
            throw new IllegalArgumentException("O ISBN deve começar com 978");
        }

        if(isbn.length() != 13){
            throw new IllegalArgumentException("ISBN deve ter 13 caracteres");
        }

        this.isbn = isbn;
    }


    public void setResumo(String resumo) {
        if (resumo == null || resumo.trim().isEmpty()) {
            throw new IllegalArgumentException("Não pode receber nulo ou espaço vazio");
        }
        if(resumo.length() > 500){
            throw new IllegalArgumentException("Tamanho do resumo superior a 500 caracteres");
        }

        this.resumo = resumo;
    }


    public void setSumario(String sumario) {
        if (sumario == null || sumario.trim().isEmpty()) {
            throw new IllegalArgumentException("Não pode receber nulo ou espaço vazio");
        }

        this.sumario = sumario;
    }


    public void setNumeroDePaginas(Integer numeroDePaginas) {
        if(numeroDePaginas == null){
            throw new IllegalArgumentException("Não pode receber nulo");
        }

        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String toString() {
        return titulo;
    }
}
