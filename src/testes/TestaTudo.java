package testes;


import br.com.edige.modelo.Autor;
import br.com.edige.modelo.Categoria;

public class TestaTudo {

    public static void main(String[] args) {

        Autor autor = new Autor("fulano@gmail.com", "Fulano de tal", "ele não faz nada da vida");

        System.out.println(autor);
    }

}
