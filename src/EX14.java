import java.util.Scanner;

public class EX14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] tabuleiro = new char[3][3];

// Inicializando com espaços vazios
        for (int l = 0; l < tabuleiro.length; l++) {
            for (int c = 0; c < tabuleiro[l].length; c++) {
                tabuleiro[l][c] = ' ';
            }
        }

// Mostrando tabuleiro inicial
        System.out.println("Tabuleiro:");
        for (int l = 0; l < tabuleiro.length; l++) {
            System.out.println(" " + tabuleiro[l][0] + " | " + tabuleiro[l][1] + " | " + tabuleiro[l][2]);
            if (l < 2) System.out.println("---|---|---");
        }

        System.out.println("\nSua vez de jogar X");
        System.out.print("Linha (0 a 2): ");
        int linha = sc.nextInt();
        System.out.print("Coluna (0 a 2): ");
        int coluna = sc.nextInt();

        if (linha >= 0 && linha <= 2 && coluna >= 0 && coluna <= 2) {
            if (tabuleiro[linha][coluna] == ' ') {
                tabuleiro[linha][coluna] = 'X';
                System.out.println("\nJogada realizada! Tabuleiro atualizado:");
            } else {
                System.out.println("\nPosição já ocupada!");
            }
        } else {
            System.out.println("\nPosição inválida!");
        }

// Mostrando tabuleiro atualizado
        for (int l = 0; l < tabuleiro.length; l++) {
            System.out.println(" " + tabuleiro[l][0] + " | " + tabuleiro[l][1] + " | " + tabuleiro[l][2]);
            if (l < 2) System.out.println("---|---|---");
        }
    }
}
