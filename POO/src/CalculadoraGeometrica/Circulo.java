package CalculadoraGeometrica;

public class Circulo extends FormaGeometrica{
    private double area;
    private double raio;
    private double circunferencia;

    public Circulo(String cor, double area, double raio, double circunferencia) {
        super(cor);
        this.area = area;
        this.raio = raio;
        this.circunferencia = circunferencia;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }

    public Circulo(String cor) {
        super(cor);
    }

    @Override
    public double calculaPerimetro() {
        return this.circunferencia / 2 * 3.14;
    }

    @Override
    public double calculaArea() {
        return this.area = 3.14 * this.raio * 2;
    }
}
