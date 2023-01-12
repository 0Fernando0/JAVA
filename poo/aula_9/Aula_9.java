package aula_9;

public class Aula_9{
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[2];

        p[0] = new Pessoa("fernando",22,'M');
        p[1] = new Pessoa("camila",20,'F');
        
        l[0] = new Livro("Aprendendo Java", "Gustavo Guanabara", 300, p[0]);
        l[1] = new Livro("Saúde Em Dia", "Simone Diaz", 350, p[1]);

        l[0].abrir();
        l[0].folhear(30);
        l[0].detalhes();

    }
}
