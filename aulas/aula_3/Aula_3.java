package aula_3;


public class Aula_3 {
    public static void main(String[] args) {
        // IF - ELSE IF - ELSE
        int media = 5;
        int nota = 7;
        int max_falta = 15;
        int falta = 14;

        if(nota >= media && falta <= max_falta){
            System.out.println("APROVADO");
        }
        else if(nota >= 4){
            System.out.println("RECUPERAÇÃO");
        }
        else{
            System.out.println("REPROVADO");
        }

        // SWITCH - CASE
        int num = 2;
        switch(num){
            case 1:
                System.out.println("válido");
                break;
            case 2:
                System.out.println("válido também");
                break;
            default:
                System.out.println("inválido");
                break;
        }
    }
}
