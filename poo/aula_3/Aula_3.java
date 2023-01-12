package aula_3;

public class Aula_3 {
    public static void main(String[] args){
        Caneta c1 = new Caneta();// criei um objeto caneta
        c1.modelo = "bic cristal";
        c1.cor = "azul";
        //c1.ponta = (float) 0.5;
        c1.carga = 80;
        // c1.tampada = true;
        c1.destampar();
        c1.tampar();
        c1.status();
    }
}
