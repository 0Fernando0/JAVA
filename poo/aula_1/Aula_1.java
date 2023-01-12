package aula_1;

public class Aula_1 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.carga = 100;
        c1.modelo = "bic";

        c1.tampar();
        c1.rabiscar();
        //c1.status();


        Caneta c2 = new Caneta();
        c2.modelo = "faber castel";
        c2.cor = "vermelha";
        c2.carga = 60;

        c2.destampar();
        c2.rabiscar();
        //c2.status();
    }
}
