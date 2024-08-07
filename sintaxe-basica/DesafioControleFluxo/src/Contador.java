import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        terminal.close();

        contar(parametroUm, parametroDois);

        }

        static void contar (int parametroUm, int parametroDois) {
            if (parametroUm > parametroDois) {
                int numeroInteracoes = parametroUm - parametroDois;
                int numeroAtual = 1;
                while (numeroAtual <= numeroInteracoes) {
                    System.out.println(numeroAtual);
                    numeroAtual++;
                }
            }
        }
//        try {
//            //chamando o método contendo a lógica de contagem
//            contar(parametroUm, parametroDois);
//
//        }catch (Exception exception) {
//            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
//        }
//
//    }
}