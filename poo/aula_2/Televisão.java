package aula_2;

public class Televisão {
    // ATRIBUTOS
    String cor;
    String marca;
    int tamanho;
    int resolução;
    boolean estado;
    // METODOS
    void ligar(){
        this.estado = true;
    }
    void desligar(){
        this.estado = false;
    }
    void MudarCanal(int canal){
        if(this.estado == false){
            System.out.println("não é possivel alterar o canal, pois a tv está desligada");
        }
        else{
            System.out.printf("canal: %d selecionado\n",canal);
        }
    }

}
