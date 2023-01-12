package aula_6;

public class ControleRemoto implements Controlador{
    // atributos
    private int volume;
    private boolean ligado; 
    private boolean tocando;

    // metodos especias
    public ControleRemoto(){
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }
    // metodos acessores
    private void setVolume(int vol){
        this.volume = vol;
    }
    private int getVolume(){
        return this.volume;
    }

    private void setLigado(boolean lig){
        this.ligado = lig;
    }
    private boolean getLigado(){
        return this.ligado;
    }

    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }
    private boolean getTocando(){
        return this.tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);    
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-".repeat(10) + "MENU" + "-".repeat(10));
        System.out.println("está ligado? " + this.getLigado());
        System.out.println("está tocando? " + this.getTocando());
        System.out.print("volume? " + this.getVolume());
        for(int i = 0; i <= this.getVolume(); i+=10){
            System.out.print("|");
        }
        System.out.print("\n");
    }
    
    @Override
    public void fecharMenu(){
        System.out.println("fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 1);
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 1);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }

}