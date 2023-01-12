package aula_3;

public class Caneta{
    // ATRIBUTOS
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    // METODOS
    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void escrever(){
        if(this.tampada == true){
            System.out.println("[ERROR] - CANETA TAMPADA");
        }
        else{
            System.out.println("escrevendo...");
        }
    }

    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("[ERROR] - CANETA TAMPADA");
        }
        else{
            System.out.println("rabiscando...");
        }
    }

    public void status(){
        System.out.println("modelo: "+this.modelo);
        System.out.println("cor: "+ this.cor);
        System.out.println("ponta: "+ this.ponta);
        System.out.println("carga: "+this.carga);
        System.out.println("tampada: "+ this.tampada);
    }
}