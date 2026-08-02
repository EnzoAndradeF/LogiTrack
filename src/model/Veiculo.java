package model;

public abstract class Veiculo {
    private String placa;
    private double capacidadeCarga;
    private double combustivelAtual;

    public Veiculo(String placa, double capacidadeCarga, int combustivelAtual) {
        this.placa = placa;
        this.capacidadeCarga = capacidadeCarga;
        this.combustivelAtual = combustivelAtual;
    }
    public Veiculo(String placa2, double capacidadeCarga2, double combustivelAtual2) {
        
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
