import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][4];
        int numerosPares = 0;
        int numerosImpares = 0;
        int somaPares = 0;

        for (int linha = 0; linha < matriz.length; linha++){

            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.println("Digite o valor da posição [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = sc.nextInt();
            }
        }
        for (int linha = 0; linha < matriz.length; linha++){

            for (int coluna = 0; coluna < matriz[linha].length; coluna++){

                if (matriz[linha][coluna] % 2 == 0){
                    numerosPares++;
                    somaPares += matriz[linha][coluna];
                }
                else{
                    numerosImpares++;
                }
            }
        }

        System.out.println("\nQuantidade de números pares: " + numerosPares);
        System.out.println("Quantidade de números ímpares: " + numerosImpares);
        System.out.println("Soma dos números pares: " + somaPares);
    }
}
