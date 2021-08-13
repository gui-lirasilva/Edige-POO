package testes;

import br.com.edige.modelo.Autor;


public class TestaTudo {

    public static void main(String[] args) {

        Autor autor = new Autor("fulano@gmail.com", "Fulanodetal", "alalalalla");
        Autor outroAutor = new Autor("fulano@gmail.com", "Irineu", "ashuashuas");

        System.out.println(autor.equals(outroAutor));
    }

}
