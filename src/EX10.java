import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] vendas = new int[3][5];
        int totalGeral = 0, maxVendas = -1, melhorVendedor = -1;

        for (int l = 0; l < vendas.length; l++) {
            for (int c = 0; c < vendas[l].length; c++) {
                System.out.print("Vendedor " + (l + 1) + " | Dia " + (c + 1) + " - Quantidade: ");
                vendas[l][c] = sc.nextInt();
                totalGeral += vendas[l][c];
            }
        }

        System.out.println("\n--- Total por Vendedor ---");
        for (int l = 0; l < vendas.length; l++) {
            int totalVendedor = 0;
            for (int c = 0; c < vendas[l].length; c++) {
                totalVendedor += vendas[l][c];
            }
            System.out.println("Vendedor " + (l + 1) + ": " + totalVendedor);

            if (totalVendedor > maxVendas) {
                maxVendas = totalVendedor;
                melhorVendedor = (l + 1);
            }
        }

        System.out.println("\n--- Total por Dia ---");
        for (int c = 0; c < vendas[0].length; c++) {
            int totalDia = 0;
            for (int l = 0; l < vendas.length; l++) {
                totalDia += vendas[l][c];
            }
            System.out.println("Dia " + (c + 1) + ": " + totalDia);
        }

        System.out.println("\nTotal Geral: " + totalGeral);
        System.out.println("Vendedor que vendeu mais: Vendedor " + melhorVendedor + " (" + maxVendas + " vendas)");
    }
}
