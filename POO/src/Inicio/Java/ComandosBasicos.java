package Inicio.Java;

import java.util.Scanner;

public class ComandosBasicos {
    //static == const
    static Scanner sc = new Scanner(System.in);//prompt
    public static void main(String[] args) {
        //Variaveis de tipos primitivos
        boolean TrueOrFalse = true;
        int numerosReais = 0; // +9999999999 a -999999999
        double decimais = 0.2; // 999999.100 a -999999.100
        char letras = 'A';

        //Variavel tipo Objeto
        String texto = "Texto";
        Integer numerosReais2 = 2; //Inteiros do tipo Objeto
        Double decimais2 = 0.2; //Decimal do tipoObjeto

        String nome = null; //nulo == ""
        String sexo = "";

        System.out.println("Qual o seu nome? "); //Escreva no terminal - para o usuário
        nome = sc.nextLine(); //Leia - Escreva na variavel nome

        System.out.println("O seu nome é " + nome);
    }
}