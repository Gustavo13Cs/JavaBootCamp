import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de cadastro de agência bancária!");

        // Solicitando e lendo número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String numeroAgencia = scanner.nextLine();

        // Solicitando e lendo número da conta
        System.out.println("Agora, digite o número da Conta:");
        String numeroConta = scanner.nextLine();

         // Solicitando e lendo nome do cliente
         System.out.println("Agora, digite o nome do cliente:");
         String nomeDoCliente = scanner.nextLine();

        // Solicitando e lendo saldo da conta
        System.out.println("Por Fim, digite o saldo inicial da Conta:");
        double saldo = scanner.nextDouble();

        // Criando um objeto AgenciaBancaria com os dados informados
        AgenciaBancaria agencia = new AgenciaBancaria(numeroAgencia, numeroConta, saldo,nomeDoCliente);

        // Exibindo os dados da agência cadastrada
        System.out.println("\nAgência cadastrada com sucesso!");
        agencia.mostrarDados();

        // Fechando o scanner
        scanner.close();
       
    }
}
