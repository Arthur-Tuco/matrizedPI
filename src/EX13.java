import java.util.Scanner;

public class EX13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length; c++){
                System.out.print("Digite o valor [" + l + "][" + c + "]: ");
                matriz[l][c] = sc.nextInt();
            }
        }

        System.out.print("\nDigite um número para pesquisar: ");
        int busca = sc.nextInt();
        int contador = 0;

        System.out.println("\nResultados da busca:");
        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length; c++){
                if(matriz[l][c] == busca){
                    System.out.println("Encontrado na linha " + l + " e coluna " + c);
                    contador++;
                }
            }
        }

        if(contador > 0){
            System.out.println("O número " + busca + " aparece " + contador + " vez(es).");
        } else {
            System.out.println("O número " + busca + " não foi encontrado.");
        }
    }
}
