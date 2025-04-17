package AtividedeDeEstudo;

import java.util.Scanner;

public class DadosPessoa {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        System.out.println("Seu nome: ");
        pessoa.setNome(sc.next());
        System.out.println("Sua idade: ");
        pessoa.setIdade(sc.nextInt());

        System.out.println(pessoa.toString());
    }
}
