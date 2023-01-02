package aula_6;

public class Aula_6 {
    // CONSTANTES (variaveis imutaveis)
    public static void main(String[] args) {
        final int MINIMO = 18; // constante por convenção são em maiscula
        
        int idade = 12;
        String evento = idade < MINIMO ? "NÃO VAI": "VAI";
        
        System.out.printf("você %s ao evento\n",evento);
    }
}
