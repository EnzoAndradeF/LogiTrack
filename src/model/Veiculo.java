package model;

public abstract class Veiculo {
    private String placa;
    private double capacidadeCarga;
    private int combustivelAtual;

    public Veiculo(String placa, double capacidadeCarga, int combustivelAtual) {
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
    public int getCombustivelAtual() {
        return combustivelAtual;
    }
    public void setCombustivelAtual(int combustivelAtual) {
        this.combustivelAtual = combustivelAtual;
    }

    public abstract double calcularAutonomia();

}
