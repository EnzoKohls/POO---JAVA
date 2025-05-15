package recuperacao_atividade.Atv_2;

public class AluguelVeiculos {
    // Estrutura de atributos privados
    private String modeloVeiculo;
    private String placa;
    private double quilometragem;

    public AluguelVeiculos (String modeloVeiculo, String placa, double quilometragem) {

        this.modeloVeiculo = modeloVeiculo;
        this.placa = placa;
        this.quilometragem = quilometragem;
    }

    public AluguelVeiculos (){

    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    @Override
    public String toString() {
        return "AluguelVeiculos{" +
                "modeloVeiculo='" + modeloVeiculo + '\'' +
                ", placa='" + placa + '\'' +
                ", quilometragem=" + quilometragem +
                '}';
    }
}
