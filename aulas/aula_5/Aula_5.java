package aula_5;

import java.util.Scanner;

public class Aula_5 {
    // ENTRADA DE DADOS
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        System.out.print("qual o seu nome: ");
        String nome = scan.nextLine();

        
        System.out.print("qual a sua idade: ");
        int idade = scan.nextInt();
        
        System.out.printf("olá %s, você tem %d anos",nome,idade);
    }
}
