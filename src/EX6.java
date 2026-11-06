import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][3];

        for (int linha = 0; linha < matriz.length; linha++) {

            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite o valor da posição [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = sc.nextInt();
            }
        }

        for (int coluna = 0; coluna < matriz[0].length; coluna++) {
            int somaColuna = 0;

            for (int linha = 0; linha < matriz.length; linha++) {
                somaColuna += matriz[linha][coluna];
            }
            System.out.println("Soma da coluna " + (coluna + 1) + ": " + somaColuna);
        }
    }
}
