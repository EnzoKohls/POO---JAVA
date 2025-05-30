package Atv_1_PilaresPOO;

import java.util.ArrayList;

public class ListaAnimal {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();

        // Adicionando animais
        animais.add(new Cachorro("Bibi", 7, "Kangal"));
        animais.add(new Gato("", 5, "Preto"));
        animais.add(new Passaro("PiuPiu", 1, "Amarelo"));

        // Testando polimorfismo
        for (Animal animal : animais) {
            animal.emitirSom();
            animal.comer();
            animal.exibirInformacoes();
            System.out.println("-----------------------------");
        }

        // Testando validação de idade negativa
        try {
            Animal erro = new Gato("Erro", -2, "Branco");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar animal: " + e.getMessage());
        }
    }
}