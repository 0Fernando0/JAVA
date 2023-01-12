package aula_1;

public class Caneta {
    // ATRIBUTOS
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    // METODOS
    void status(){
        System.out.println("o modelo é "+ this.modelo);
        System.out.println("a cor é "+ this.cor);
        System.out.println("a ponta é " + this.ponta);
        System.out.println("a carga é " + this.carga);
        System.out.println("está tampada? "+ this.tampada);
    }

    void rabiscar(){
        if(this.tampada == true){
            System.out.println("voçê não pode rabiscar com a caneta tampada");
            return;
        }
        System.out.println("rabiscando...");
    }

    void tampar(){
        tampada = true;
    }

    void destampar(){
        tampada = false;
    }
}
