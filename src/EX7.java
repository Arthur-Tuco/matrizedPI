import java.util.Scanner;

public class EX7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int somaDiagonal = 0;

        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length; c++){
                System.out.print("Digite o valor da posição [" + l + "][" + c + "]: ");
                matriz[l][c] = sc.nextInt();
            }
        }

        System.out.print("\nElementos da diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
            somaDiagonal += matriz[i][i];
        }
        System.out.println("\nSoma da diagonal principal: " + somaDiagonal);
    }
}
