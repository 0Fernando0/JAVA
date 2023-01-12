package aula_4;

// MÉTODOS ESPECIAS 

public class Caneta {
    // ATRIBUTOS
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    // METODOS CONSTRUTORES
    public Caneta(String m,String c,float p){ // MÉTODO CONSTRUTOR
        this.setModelo(m);
        this.setPonta(p);
        this.setCor(c);
        this.destampar();
    }

    // METODOS ACESSORES
    public boolean getTampada(){
        return this.tampada;
    }

    public String getCor(){ // GETTER
        return this.cor;
    }

    public void setCor(String c){ // SETTER
        this.cor = c;
    }

    public String getModelo(){ // GETTER
        return this.modelo;
    }

    public void setModelo(String model){ // SETTER
        this.modelo = model;
    }
    
    public float getPonta(){ // GETTER
        return this.ponta;
    }

    public void setPonta(float p){ // SETTER
        this.ponta = p;
    }

    // METODOS
    public void status(){
        System.out.print("\n");
        System.out.println("modelo: " + this.getModelo());
        System.out.println("ponta: " + this.getPonta());
        System.out.println("cor: " + this.getCor());
        System.out.println("tampada: " + this.getTampada());
        System.out.print("\n");
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
