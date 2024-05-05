import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Inicialização do Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitação de informações da conta bancária
        System.out.println("Bem-vindo ao sistema de criação de conta bancária!");
        System.out.println("Por favor, insira os seguintes detalhes:");

        System.out.print("Número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Número da Conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Limpeza do buffer

        System.out.print("Nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Saldo Inicial: R$ ");
        double saldoInicial = scanner.nextDouble();

        // Exibição das informações da conta bancária
        System.out.println("\n----- Conta Bancária Criada com Sucesso -----");
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Número da Agência: " + agencia);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo Inicial: R$ " + saldoInicial);

        // Agradecimento ao usuário
        System.out.println("\nObrigado por criar uma conta conosco, " + nomeCliente + "!");
        System.out.println("Seu saldo está disponível para saque imediato.");

        // Fechamento do Scanner
        scanner.close();
    }
}
