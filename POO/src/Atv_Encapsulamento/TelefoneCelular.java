package Atv_Encapsulamento;

public class TelefoneCelular {
    String marca;
    String cor;
    String modelo;
    int armazenamento;

    TelefoneCelular (String marca, String cor, String modelo, int armazenamento) {
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.armazenamento = armazenamento;
    }

    TelefoneCelular () {

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    @Override
    public String toString() {
        return "TelefoneCelular -> (" +
                "marca: '" + marca + '\'' +
                ", cor: '" + cor + '\'' +
                ", modelo: '" + modelo + '\'' +
                ", armazenamento: " + armazenamento +
                ')';
    }
}
