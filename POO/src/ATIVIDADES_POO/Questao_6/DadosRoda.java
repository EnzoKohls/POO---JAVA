package ATIVIDADES_POO.Questao_6;

import java.util.Scanner;

public class DadosRoda {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Roda roda = new Roda();

        System.out.println("Sua cor: ");
        roda.setCor(sc.next());
        System.out.println("Seu tamanho: ");
        roda.setTamanho(sc.nextInt());
        System.out.println("Sua largura: ");
        roda.setLargura(sc.nextInt());

        System.out.println(roda.toString());
    }
}
