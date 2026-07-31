package model;

public class Van extends Veiculo{

    private boolean possuiRefrigeracao;

    public boolean isPossuiVentilacao() {
        return possuiRefrigeracao;
    }
    

    public Van(String placa, double capacidadeCarga, int combustivelAtual, boolean possuiRefrigeracao) {
        super(placa, capacidadeCarga, combustivelAtual);
        this.possuiRefrigeracao = possuiRefrigeracao;
    }


    @Override
    public double calcularAutonomia() {
        double consumoMedio;

        if (possuiRefrigeracao) {
            consumoMedio = 8.0;
        } else {
            consumoMedio = 10.0;
        }

        return this.getCombustivelAtual() * consumoMedio;
    }

    
}
