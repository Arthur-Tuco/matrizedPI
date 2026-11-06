public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int[][] matriz = new int[3][3];

    for(int linha = 0; linha < matriz.length; linha++){

        for(int coluna = 0; coluna < matriz[linha].length; coluna++){
            System.out.println("Digite o valor da posição [" + linha + "][" + coluna + "]: ");

        matriz[linha][coluna] = sc.nextInt();
        }
    }
    System.out.println("\nMatriz: ");

    for (int linha = 0 ; linha < matriz.length ; linha++){

        System.out.print("| ");

        for (int coluna = 0; coluna < matriz[linha].length; coluna++){
            System.out.print(matriz[linha][coluna] + "\t");
        }
        System.out.println("|");
    }
}