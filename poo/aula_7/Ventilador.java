package aula_7;

public class Ventilador implements Controles {
    // ATRIBUTOS
    private boolean ligado;
    private int potencia;
    private String marca;
    private String cor;
    private boolean travado;

    // METODO CONTRUTOR
    public Ventilador(String marca,String cor){
        this.setLigado(false);
        this.setPotencia(0);
        this.setMarca(marca);
        this.setCor(cor);
    }

    // METODOS GETTER
    private boolean getLigado(){
        return this.ligado;
    }
    
    private int getPotencia(){
        return this.potencia;
    }
    
    private String getMarca(){
        return this.marca;
    }

    private String getCor(){
        return this.cor;
    }

    private boolean getTravado(){
        return this.travado;
    }
    // METODOS SETTER
    private void setLigado(boolean s){
        this.ligado = s;
    }
    private void setPotencia(int p){
        this.potencia = p;
    }

    private void setMarca(String marca){
        this.marca = marca;
    }

    private void setCor(String cor){
        this.cor = cor;
    }

    private void setTravado(boolean travado){
        this.travado = travado;
    }
    // METODOS ABSTRATOS
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);        
    }

    @Override
    public void travar() {
        this.setTravado(true);        
    }

    @Override
    public void destravar() {
        this.setTravado(false);
    }

    @Override
    public void aumentar() {
        this.setPotencia(this.getPotencia() + 1);        
    }

    @Override
    public void diminuir() {
        this.setPotencia(this.getPotencia() - 1);        
    }

    @Override
    public void status() {
        System.out.println("Marca: " + this.getMarca());        
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ligado? " + this.getLigado());        
        System.out.println("Potencia: " + this.getPotencia());        
        System.out.println("Travado? " + this.getTravado());        
    }

}
