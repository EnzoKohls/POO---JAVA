package AtividadeCasa;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();

        animals.add(new Cachorro("Bibi", 5, "Viralata"));

        for (Animal animal : animals) {
            animal.emitirSom();
            animal.comer();
            animal.exibirInformacoes();
            System.out.println("-----");
        }
    }
}
