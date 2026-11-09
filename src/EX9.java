import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] notas = new double[5][3];
        double somaGeral = 0;

        for (int l = 0; l < notas.length; l++) {
            System.out.println("--- Notas do Aluno " + (l + 1) + " ---");
            for (int c = 0; c < notas[l].length; c++) {
                System.out.print("Avaliação " + (c + 1) + ": ");
                notas[l][c] = sc.nextDouble();
            }
        }

        System.out.println("\n--- Resultados ---");
        for (int l = 0; l < notas.length; l++) {
            double somaAluno = 0;
            for (int c = 0; c < notas[l].length; c++) {
                somaAluno += notas[l][c];
            }
            double mediaAluno = somaAluno / 3;
            somaGeral += mediaAluno;

            System.out.print("Aluno " + (l + 1) + " - Média: " + mediaAluno);
            if (mediaAluno >= 6) {
                System.out.println(" (Aprovado)");
            } else {
                System.out.println(" (Reprovado)");
            }
        }
        System.out.println("Média geral da turma: " + (somaGeral / 5));
    }
}
