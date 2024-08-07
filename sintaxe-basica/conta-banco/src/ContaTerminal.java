import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua conta:");
        int conta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite o número da sua Agencia:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite seu nome completo:");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite seu saldo:");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +
                ", conta "+ conta +" e seu saldo "+ saldo +" já está disponível para saque");

        scanner.close();
    }
}