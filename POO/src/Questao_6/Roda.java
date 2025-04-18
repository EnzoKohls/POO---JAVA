package Questao_6;

public class Roda {
    private String cor;
    private int tamanho;
    private int largura;
    private String material;

    public Roda(String cor, int tamanho, int largura, String material) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.largura = largura;
        this.material = material;
    }

    public Roda() {

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Roda{" +
                "cor='" + cor + '\'' +
                ", tamanho=" + tamanho +
                ", largura=" + largura +
                ", material='" + material + '\'' +
                '}';
    }
}
