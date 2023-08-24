import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        String agencia;
        String nomeCliente;
        float saldoConta;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome completo:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: (4 digitos)");
        agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta bancária: (4 digitos)");
        numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o valor em reais do deposito em conta: ");
        saldoConta = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de " + saldoConta + " R$ já está disponivel para saque.");
        scanner.close();


    }
}
