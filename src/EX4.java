import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int linha = 0; linha < matriz.length; linha++) {

            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite o valor da posição [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = sc.nextInt();
            }
        }

        int maiorNumero = matriz[0][0];
        int menorNumero = matriz[0][0];

        int linhaMaior = 0;
        int linhaMenor = 0;

        int colunaMaior = 0;
        int colunaMenor = 0;

        for (int linha = 0; linha < matriz.length; linha++) {

            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {

                if (matriz[linha][coluna] < menorNumero) {
                    menorNumero = matriz[linha][coluna];
                    linhaMenor = linha;
                    colunaMenor = coluna;
                }
                if (matriz[linha][coluna] > maiorNumero) {
                    maiorNumero = matriz[linha][coluna];
                    linhaMaior = linha;
                    colunaMaior = coluna;
                }
            }
        }
        System.out.println("\nMenor: " + menorNumero
                + " na posição [" + linhaMenor + "][" + colunaMenor + "]");

        System.out.println("Maior: " + maiorNumero
                        + " na posição [" + linhaMaior + "][" + colunaMaior + "]");
    }
}
