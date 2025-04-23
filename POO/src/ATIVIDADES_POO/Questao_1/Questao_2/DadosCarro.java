package ATIVIDADES_POO.Questao_1.Questao_2;

import java.util.Scanner;

public class DadosCarro {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();

        System.out.println("A marca do carro 1: ");
        carro1.setMarca(sc.next());
        System.out.println("O modelo do carro 1: ");
        carro1.setModelo(sc.next());
        System.out.println("O ano do carro 1: ");
        carro1.setAno(sc.nextInt());

        System.out.println("A marca do carro 2: ");
        carro2.setMarca(sc.next());
        System.out.println("O modelo do carro 2: ");
        carro2.setModelo(sc.next());
        System.out.println("O ano do carro 2: ");
        carro2.setAno(sc.nextInt());

        System.out.println("A marca do carro 3: ");
        carro3.setMarca(sc.next());
        System.out.println("O modelo do carro 3: ");
        carro3.setModelo(sc.next());
        System.out.println("O ano do carro 3: ");
        carro3.setAno(sc.nextInt());

        System.out.println(carro1.toString());
        System.out.println(carro2.toString());
        System.out.println(carro3.toString());
    }
}
