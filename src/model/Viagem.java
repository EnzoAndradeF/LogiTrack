package model;

public class Viagem {

    private Veiculo veiculo;
    private Motorista motorista;
    private double distancia;

    public Viagem(Veiculo veiculo, Motorista motorista, double distancia) {
        this.veiculo = veiculo;
        this.motorista = motorista;
        this.distancia = distancia;
    }

    public void exibirRelatorio(){
        System.out.println("Motorista: " + motorista.getNome() + " | CNH: " + motorista.getCnh());
        System.out.println("Veículo Placa: " + veiculo.getPlaca() + " | Distância: " + distancia + " km"); 
    }

    
}
