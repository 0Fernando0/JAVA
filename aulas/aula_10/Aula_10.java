package aula_10;


import java.util.Arrays;

public class Aula_10{
    public static void main(String[] args) {
        // METODOS DE ARRAYS
        int[] num = {1,0,2,6,3,4,8,5,9,7};
        int[] num2 = new int[10];

        Arrays.sort(num);// ordenando os arrays
        Arrays.fill(num2, 10);// preenchendo arrays
        //System.arraycopy(num, 0, num2, 0, 10);// copiar array
        //Arrays.equals(num, num2); faz comparação entre arrays
        //Arrays.binarySearch(num,2);// verifica se existe um elemento no array

        for(int n:num2){
            System.out.print(n+" ");
        }
      
    }
}