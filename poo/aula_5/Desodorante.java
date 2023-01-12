package aula_5;

public class Desodorante {
    public String marca;
    public char genero;
    public int duração;
    private int carga = 10;
    private boolean travado;
    // METODO CONSTRUTOR
    public Desodorante(String marca,char genero,int duração){
        this.setMarca(marca);
        this.setGenero(genero);
        this.setDuração(duração);
        this.travar();
    }
    ///////////////////////////////////////////
    // METODOS ACESSORES
    public String getMarca(){
        return this.marca;
    }
    public char getGenero(){
        return this.genero;
    }
    public int getDuração(){
        return this.duração;
    }
    public boolean getTravado(){
        return this.travado;
    }
    public int getCarga(){
        return this.carga;
    }
    // METODOS MODIFICADORES
    public void setMarca(String m){
        this.marca = m;
    }
    public void setGenero(char g){
        this.genero = g;
    }
    public void setDuração(int a){
        this.duração = a;
    }
    /////////////////////////////////////////////
    public void status(){
        System.out.print("\n");
        System.out.println("marca: "+this.getMarca());
        System.out.println("genero: "+ this.getGenero());
        System.out.println("duração: "+ this.getDuração());
        System.out.println("carga: "+ this.getCarga());
        System.out.println("travado: " + this.getTravado());
        System.out.print("\n");
    }
    public void travar(){
        this.travado = true;
    } 
    public void destravar(){
        this.travado = false;
    }

    public void usar(){
        if(this.getTravado() == true){
            System.out.println("[ERRO] o desodorante "+ this.getMarca() + " está travado");           
        }
        else if(this.getCarga() == 0){
            System.out.println("acabou o desodorante");
            System.out.println("Você precisa comprar outro");
        }
        else{
            System.out.println("usando desodorante");
            this.carga--;
        }
    }
}
