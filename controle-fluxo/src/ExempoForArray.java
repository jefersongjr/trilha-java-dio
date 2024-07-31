public class ExempoForArray {
    public static void main(String[] args) {
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

//        for (int i = 0; i < alunos.length; i++) {
//            System.out.println("O aluno no indice x= " + i + " e " + alunos[i]);
//        }

        for(String aluno: alunos) {
            System.out.println("O aluno do aluno e " + aluno); //ForEach
        }
    }
}
