public class EX12 {
    public static void main(String[] args){
        int[][] matriz = new int[4][4];

        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length; c++){
                if(l == c){
                    matriz[l][c] = 1;
                } else {
                    matriz[l][c] = 0;
                }
            }
        }

        System.out.println("Matriz Identidade 4x4: ");
        for (int l = 0 ; l < matriz.length ; l++){
            System.out.print("| ");
            for (int c = 0; c < matriz[l].length; c++){
                System.out.print(matriz[l][c] + "\t");
            }
            System.out.println("|");
        }
    }
}
