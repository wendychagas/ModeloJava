
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        ServiceDesk sd = new ServiceDesk();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Abrir chamado");
            System.out.println("2. Resolver chamado");
            System.out.println("3. Lista de chamados em aberto");
            System.out.println("4. Sair");

            System.out.print("Escolha uma opcao: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("\nDigite a descricao do problema: ");
                    scanner.nextLine(); 
                    String descricao = scanner.nextLine();
                    sd.abrirChamado(descricao);
                    break;
                case 2:
                    System.out.print("\nDigite o ID do chamado a ser resolvido: ");
                    int chamadoId = scanner.nextInt();
                    sd.resolverChamado(chamadoId);
                    break;
                case 3:
                    sd.chamadosEmAberto();
                    break;
                case 4:
                    System.out.println("\nSaindo do sistema.");
                    System.exit(0);
                default:
                    System.out.println("\nOpcao invalida. Tente novamente.");
            }
        }
    }
}