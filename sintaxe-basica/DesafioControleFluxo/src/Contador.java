import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        terminal.close();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException error) {
            System.out.println("O primeiro numero deve ser maior que o segundo!");
        }

        }

        static void contar(int parametroUm, int parametroDois)  throws ParametrosInvalidosException{
            if (parametroUm > parametroDois) {
                int numeroInteracoes = parametroUm - parametroDois;
                for (int i = 1;  i <= numeroInteracoes ; i++) {
                    System.out.println("Imprimindo o numero: " + i);
                }
            } else {
                throw new ParametrosInvalidosException();
            }
        }

}