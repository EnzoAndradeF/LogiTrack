package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import exception.CombustivelInsuficienteException;
import model.Caminhao;
import model.Motorista;
import model.Van;
import model.Veiculo;
import service.GerenciadorViagens;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorViagens gerenciador = new GerenciadorViagens();

        Veiculo van1 = new Van("VAN-123", 1200.0, 10.0, true);
        Veiculo caminhao1 = new Caminhao("CAM-123", 15000, 50.0, 3);

        int opcao = 0;

        do {
            try {
                System.out.println("\n===== Sistema LogiTrack =====");
                System.out.println("1. Tentar viagem com a Van (" + van1.getPlaca() + ")");
                System.out.println("2. Tentar viagem com o Caminhão (" + caminhao1.getPlaca() + ")");
                System.out.println("3. Exibir histórico de viagens");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");

                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                    case 2:
                        System.out.println("Digite o nome do Motorista: ");
                        String nome = scanner.nextLine();

                        System.out.println("Digite a categoria da CNH do motorista (B/D/E)");
                        String cnh = scanner.nextLine();

                        Motorista motorista = new Motorista(nome, cnh);

                        System.out.println("Digite a distância do destino (km)");
                        double distancia = scanner.nextDouble();
                        scanner.nextLine();

                        Veiculo veiculoSelecionado = (opcao == 1) ? van1 : caminhao1;

                        try {
                            gerenciador.validarEIniciarViagem(veiculoSelecionado, motorista, distancia);
                        } catch (CombustivelInsuficienteException e) {
                            System.out.println("\n🛑 [BLOQUEADO PELO SISTEMA]");
                            System.err.println(e.getMessage());
                            System.out.println("Sugestão: Abasteça o veículo ou use outra rota.");
                        }
                        break;

                    case 3:
                        gerenciador.listarViagens();
                        break;

                    case 0:
                        System.out.println("Encerrando o sistema LogiTrack...");
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("\n❌ Erro: Você digitou um caractere inválido onde um número era esperado.");
                scanner.nextLine();
            }

        } while (opcao != 0);

        scanner.close();
    }

}
