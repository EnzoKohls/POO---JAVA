package AutoCar;

public class Veiculo {
    private int quantidadesRodas;
    private String chassi;
    private String marca;
    private String tipo;

    public Veiculo(int qunatidadeRodas, String chassi, String marca, String tipo) {
        this.quantidadesRodas = quantidadesRodas;
        this.chassi = chassi;
        this.marca = marca;
        this.tipo = tipo;
    }

    public Veiculo() {

    }

    public int getQuantidadesRodas() {
        return quantidadesRodas;
    }

    public void setQuantidadesRodas(int quantidadesRodas) {
        this.quantidadesRodas = quantidadesRodas;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Veiculo: " +
                "quantidadesRodas: " + quantidadesRodas +
                ", chassi: '" + chassi + '\'' +
                ", marca: '" + marca + '\'' +
                ", tipo: '" + tipo + '\'' +
                '}';
    }
}
