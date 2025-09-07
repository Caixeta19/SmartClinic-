import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<CadastroPaciente> consultas = new ArrayList<>();
        int opcao;

        System.out.println("Bem-Vindo(a) ao SmartClinic");
        System.out.println("---------------------------");

        do {
            System.out.println("--- Menu ---");
            System.out.println("1- Nova consulta");
            System.out.println("2- Cancelar consulta");
            System.out.println("3- Remarcar consulta");
            System.out.println("4- Ver histórico de consultas");
            System.out.println("5- Pacientes cadastrados");
            System.out.println("0- Sair do menu");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    int resposta;
                    do {
                        System.out.println("Deseja agendar uma nova consulta?");
                        System.out.println("1- Sim");
                        System.out.println("2- Não");
                        resposta = scanner.nextInt();
                        scanner.nextLine();

                        if (resposta == 1) {
                            System.out.println("Digite seu nome completo:");
                            String nome = scanner.nextLine();
                            System.out.println("Digite seu CPF:");
                            String cpf = scanner.nextLine();
                            System.out.println("Digite seu email:");
                            String email = scanner.nextLine();
                            System.out.println("Digite seu número de telefone:");
                            String telefone = scanner.nextLine();
                            System.out.println("Possui plano de saúde? (sim/não):");
                            boolean planoDeSaude = scanner.nextLine().equalsIgnoreCase("sim");
                            System.out.println("Digite o seu endereço completo:");
                            String endereco = scanner.nextLine();

                            CadastroPaciente paciente1 = new CadastroPaciente(nome, cpf, email, telefone, planoDeSaude, endereco);
                            consultas.add(paciente1);

                            System.out.println("Consulta agendada com sucesso para: " + paciente1.getNome());

                        } else if (resposta == 2) {
                            System.out.println("Voltando ao menu...");
                        } else {
                            System.out.println("Opção inválida, tente novamente.");
                        }

                    } while (resposta != 1 && resposta != 2);
                    break;

                case 4:
                    System.out.println("--- Histórico de consultas ---");
                    if (consultas.isEmpty()) {
                        System.out.println("Nenhuma consulta agendada.");
                    } else {
                        for (CadastroPaciente p : consultas) {
                            System.out.println(p);
                        }
                    }
                    break;
                case 5:
                    System.out.println("--- Pacientes cadastrados ---");
                    if (consultas.isEmpty()) {
                        System.out.println("Nenhuma consulta agendada.");
                    } else {
                        for (CadastroPaciente p : consultas) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 0);
        scanner.close();
    }
}
