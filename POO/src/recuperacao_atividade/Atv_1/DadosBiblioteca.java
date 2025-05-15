package recuperacao_atividade.Atv_1;

import java.util.Scanner;

public class DadosBiblioteca {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Criando os objeto da classe
        Biblioteca biblioteca1 = new Biblioteca();
        Biblioteca biblioteca2 = new Biblioteca();
        Biblioteca biblioteca3 = new Biblioteca();

        // Definindo valores
        System.out.println("Informe o título do livro: ");
        biblioteca1.setTituloLivro(sc.next());
        System.out.println("Informe o autor do livro: ");
        biblioteca1.setAutor(sc.next());
        System.out.println("Informe o ano de publicação do livro: ");
        biblioteca1.setAnoPublicacao(sc.nextInt());

        // Codigo de erro para valor inválido
        if (biblioteca1.getAnoPublicacao() < 1900) {
            throw new IllegalArgumentException("Ano do livro não aceito");
        }

        System.out.println("Informe o título do livro: ");
        biblioteca2.setTituloLivro(sc.next());
        System.out.println("Informe o autor do livro: ");
        biblioteca2.setAutor(sc.next());
        System.out.println("Informe o ano de publicação do livro: ");
        biblioteca2.setAnoPublicacao(sc.nextInt());

            if (biblioteca2.getAnoPublicacao() < 1900) {
                throw new IllegalArgumentException("Ano do livro não aceito");
            }

                System.out.println("Informe o título do livro: ");
                biblioteca3.setTituloLivro(sc.next());
                System.out.println("Informe o autor do livro: ");
                biblioteca3.setAutor(sc.next());
                System.out.println("Informe o ano de publicação do livro: ");
                biblioteca3.setAnoPublicacao(sc.nextInt());

                if (biblioteca3.getAnoPublicacao() < 1900) {
                    throw new IllegalArgumentException("Ano do livro não aceito");
                }

                    // Exibir os dados
                    System.out.println(biblioteca1.toString());
                    System.out.println(biblioteca2.toString());
                    System.out.println(biblioteca3.toString());

                }
            }