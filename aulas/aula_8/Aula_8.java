package aula_8;
// import java.util.Scanner;

public class Aula_8 {
    public static void main(String[] args){
        // ARRAY com 5 espaços
        int[] num = new int[5];

        // adicionando elementos no array
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;

        for(int i = 0; i < num.length; i++){
            System.out.println(i+ " - "+num[i]);
        }
        /////////////////////////////////////////////////
        // array com valores definidos
        String[] nomes = {"Fernando","Gustavo","Anderson"};
        
        System.out.println(nomes[2]);
    }
}
