package aula_11;

import java.security.SecureRandom;

public class Aula_11{
    // MATRIZES
    public static void main(String[] args) {
        final int linhas = 3;
        final int colunas = 5;

        // MATRIZ VAZIA
        int[][] num = new int [linhas][colunas];

        for(int l = 0; l < linhas; l++){
            for(int c = 0; c < colunas; c++){
                num[l][c] = new SecureRandom().nextInt(100);
            }
        }

        for(int[] l:num){
            for(int c:l){
                System.out.printf("%2d |",c);
            }
            System.out.print("\n");
        }

        // MATRIZ COM DADAS
        int[][] valores = {
            {0,1,2},
            {3,4,5},
            {6,7,8}
        };

        /*
        for(int l = 0; l < linhas; l++){
            for(int c = 0 ; c < colunas; c++){
                System.out.printf("%2d |",num[l][c]);
            }
            System.out.print("\n");
        }
        */
    }
}