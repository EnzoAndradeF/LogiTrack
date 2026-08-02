package model;

public class Caminhao extends Veiculo {

    private int quantidadeEixos;

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public Caminhao(String placa, double capacidadeCarga, double combustivelAtual, int quantidadeEixos) {
        super(placa, capacidadeCarga, combustivelAtual);
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularAutonomia() {
        double consumoMedio = 3.0 - (quantidadeEixos * 0.2);
        return this.getCombustivelAtual() * consumoMedio;
    }

}
