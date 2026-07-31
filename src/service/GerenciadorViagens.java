package service;

import java.util.ArrayList;

import exception.CombustivelInsuficienteException;
import model.Motorista;
import model.Veiculo;
import model.Viagem;

public class GerenciadorViagens {

    private ArrayList<Viagem> viagens;

    public GerenciadorViagens(ArrayList<Viagem> viagens) {
        this.viagens = viagens;
    }



    public void validarEIniciarViagem(Veiculo veiculo, Motorista motorista, double distanciaDestino){
        double autonomiaDisponivel = veiculo.calcularAutonomia();

        System.out.println("Verificando frota...");
        System.out.println("Veículo placa [" + veiculo.getPlaca() + "] tem " + autonomiaDisponivel + " km de autonomia.");

        if (distanciaDestino > autonomiaDisponivel) {
            throw new CombustivelInsuficienteException("Combustível insuficiente! O destino fica a " + distanciaDestino + " km, mas o veiculo só consegue rodar mais " + autonomiaDisponivel + " km de distância");
        }

        Viagem novaViagem = new Viagem(veiculo, motorista, distanciaDestino);
        viagens.add(novaViagem);

        System.out.println("Viagem autorizada com sucesso");
        System.out.println("Motorista " + motorista.getNome() + " já pode partir rumo ao destino (" + distanciaDestino + " km).");
    }

    public void listarViagens(){
        System.out.println("\n ***** Histórico de viagens concluídas *****");
        if (viagens.isEmpty()) {
            System.out.println("Nenhuma viagem registrada");
            return;
        }

        for (Viagem viagem : viagens) {
            viagem.exibirRelatorio();
            System.out.println("===================================");
        }
    }
}
