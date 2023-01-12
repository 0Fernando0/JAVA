package aula_8;
import java.security.SecureRandom;


public class Luta{
    private Lutador desafiado,desafiante;
    private int round;
    private boolean aprovado;

    // METODOS GETTER
    private Lutador getDesafiado(){
        return this.desafiado;
    }
    private Lutador getDesafiante(){
        return this.desafiante;
    }
    private int getRound(){
        return this.round;
    }

    private boolean getAprovado(){
        return this.aprovado;
    }
    // METODOS SETTER
    private void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }
    private void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }
    private void setRound(int round){
        this.round = round;
    }
    private void setAprovado(boolean aprovado){
        this.aprovado = aprovado;
    }

    // METODOS DE INTERFACE
    public void Lutar() {
        if(this.getAprovado()){
            System.out.println("##########DESAFIADO##########");
            this.desafiado.apresentação();

            System.out.println("##########DESAFIANTE##########");
            this.desafiante.apresentação();

            SecureRandom vencedor = new SecureRandom();
            switch(vencedor.nextInt(3)){
                case 0:
                    System.out.println("EMPATE");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1:
                    System.out.println("VITORIA DO "+ this.getDesafiado().getNome());
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                case 2:
                    System.out.println("VITORIA DO "+ this.getDesafiante().getNome());
                    this.getDesafiado().perderLuta();
                    this.getDesafiante().ganharLuta();
                    break;    
            }
        }
        else{
            System.out.println("NÃO É POSSIVEL REALIZAR A LUTA");
        }
        
    }

    public void MarcarLuta(Lutador l1,Lutador l2) {
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.setAprovado(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }    
        else{
            this.setAprovado(false);
            System.out.println("Não é possivel marcar a luta");
        }
    }   
}
