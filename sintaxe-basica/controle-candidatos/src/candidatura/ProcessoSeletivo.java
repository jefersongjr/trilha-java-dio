package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirSelecionados();

    }
    static void imprimirSelecionados() {
        String [] candidatos = { "Felipe", "Julia", "Paulo", "Marcia", "Augusto", "Monica"};
        System.out.println("Imprimindo a lista de candidato informando o indice do elemento");

        for( int i = 0; i < candidatos.length; i++){
            System.out.println("O candidato de n: " + (i+1) + " e o " + candidatos[i] );
        }

        System.out.println("Forma abreviada da interaçao forEach");
        for(String candidato: candidatos) {
            System.out.println("O candidato selecionado foi " + candidato );
        }
    }

    static void selecaoCandidatos() {
        String [] candidatos = { "Felipe", "Julia", "Paulo", "Marcia", "Augusto", "Monica", "Fabricio", "Mirela",
                "Daniela", "Jorge"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while( candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + "Solicitou esse valor de salario " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + "foi selecionado pela vaga");
                candidatosSelecionados ++;
            }
            candidatoAtual++;
        }

    }

    static double valorPretendido () {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para o Candidato");
        } else if ( salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando resultado de outros candidatos");
        }
    }
}
