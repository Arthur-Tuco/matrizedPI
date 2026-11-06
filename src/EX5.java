import java.util.Scanner;

public class EX5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][4];

        for (int linha = 0; linha < matriz.length; linha++) {

            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite o valor da posição [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = sc.nextInt();
            }
        }

        for (int linha = 0; linha < matriz.length; linha++) {

            int somaLinha = 0;

            for (int coluna = 0; coluna < matriz.length; coluna++) {

                somaLinha += matriz[linha][coluna];
            }

            System.out.println("Soma da linha " + + (linha + 1) + ": " + somaLinha);
        }

    }
}
