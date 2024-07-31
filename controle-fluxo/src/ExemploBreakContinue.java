public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i <= 5 ; i++) {
            if (i == 3)
                // break; // para a interaçao quando o numero for igual a 3

                continue; //pula a etapa de imprimir quando i= 3
            System.out.println("Continuando");
        }
    }
}
