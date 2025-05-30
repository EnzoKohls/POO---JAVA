package Atv_1_PilaresPOO;

public abstract class Animal {
    private String nome;
    private int idade;

    public Animal (String nome, int idade){
        this.nome = nome;
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade negativa");
        }
        this.idade = idade;
    }

    public abstract void emitirSom();
    public abstract void comer();
    public abstract void exibirInformacoes();
}
