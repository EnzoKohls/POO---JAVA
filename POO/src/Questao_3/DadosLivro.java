package Questao_3;

import java.util.Scanner;

public class DadosLivro {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        Livro livro3 = new Livro();

        System.out.println("Título livro 1: ");
        livro1.setTitulo(sc.next());
        System.out.println("Autor livro 1: ");
        livro1.setAutor(sc.next());
        System.out.println("Ano de publicação livro 1: ");
        livro1.setAnoDePublicacao(sc.nextInt());

        System.out.println("Título Título livro 2: ");
        livro2.setTitulo(sc.next());
        System.out.println("Autor livro 2: ");
        livro2.setAutor(sc.next());
        System.out.println("Ano de publicação livro 2: ");
        livro2.setAnoDePublicacao(sc.nextInt());

        System.out.println("Título Título livro 3: ");
        livro3.setTitulo(sc.next());
        System.out.println("Autor livro 3: ");
        livro3.setAutor(sc.next());
        System.out.println("Ano de publicação livro 3: ");
        livro3.setAnoDePublicacao(sc.nextInt());

        System.out.println(livro1.toString());
        System.out.println(livro2.toString());
        System.out.println(livro3.toString());
    }
}
