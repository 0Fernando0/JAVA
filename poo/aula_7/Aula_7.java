package aula_7;

public class Aula_7 {
    public static void main(String[] args) {
        Ventilador vent = new Ventilador("ultra","branco");
        vent.ligar();
        vent.aumentar();
        vent.travar();
        vent.status();
    }
}
