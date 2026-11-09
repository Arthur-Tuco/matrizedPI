import java.util.Scanner;

public class EX8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[2][3];

        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length; c++){
                System.out.print("Digite o valor [" + l + "][" + c + "]: ");
                matriz[l][c] = sc.nextInt();
            }
        }

        System.out.println("\nMatriz Original:");
        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length; c++){
                System.out.print(matriz[l][c] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatriz Transposta:");
        for(int c = 0; c < matriz[0].length; c++){ // inverte l e c
            for(int l = 0; l < matriz.length; l++){
                System.out.print(matriz[l][c] + "\t");
            }
            System.out.println();
        }
    }
}
