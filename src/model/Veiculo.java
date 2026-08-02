package model;

public abstract class Veiculo {
    private String placa;
    private double capacidadeCarga;
    private double combustivelAtual;

    public Veiculo(String placa, double capacidadeCarga, double combustivelAtual) {
        this.placa = placa;
        this.capacidadeCarga = capacidadeCarga;
        this.combustivelAtual = combustivelAtual;
    }

    public String getPlaca() {
        return placa;
    }
    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }
    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
    public double getCombustivelAtual() {
        return combustivelAtual;
    }
    public void setCombustivelAtual(double combustivelAtual) {
        this.combustivelAtual = combustivelAtual;
    }

    public abstract double calcularAutonomia();

}
