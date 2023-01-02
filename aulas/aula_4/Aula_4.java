package aula_4;

public class Aula_4 {
    // OPERADOR TERNARIO
    public static void main(String[] args) {
        int media = 5;
        int nota = 4;
        String res;

        res = (nota >= media) ? "APROVADO" : "REPROVADO";
        
        System.out.println(res);
    }
}
