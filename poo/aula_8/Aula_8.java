package aula_8;

public class Aula_8 {
    public static void main(String[] args) {
        Lutador[] l = new Lutador[2];

        l[0] = new Lutador("fernando", "brasileiro", 
        (byte) 22, 1.82f, 85.0f, 13, 2, 1);

        l[1] = new Lutador("gustavo", "coreano", (byte) 25, 1.92f, 85.0f, 15, 3, 2);

        Luta UFC1 = new Luta();

        UFC1.MarcarLuta(l[0], l[1]);
        UFC1.Lutar();

        for(Lutador lutador:l){
            lutador.status();
        }

    }
}
