package aula_2;

public class Aula_2 {
    public static void main(String[] args) {
        Televisão tv = new Televisão();
        tv.cor = "branca";
        tv.marca = "sansung";
        tv.resolução = 2080;
        tv.tamanho = 50;

        tv.ligar();
        tv.MudarCanal(11);
        tv.desligar();
        tv.MudarCanal(13);
    }
}
