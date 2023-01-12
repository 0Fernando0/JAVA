package aula_9;

public class Pessoa{
    private String nome;
    private int idade;
    private char sexo;

    // METODO CONSTRUTOR
    public Pessoa(String nome,int idade,char sexo){
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }

    // METODOS GETTER
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public char getSexo(){
        return this.sexo;
    }

    // METODOS SETTER
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    // METODOS 
    public void fazerAniver(){
        this.setIdade((this.getIdade() + 1));
    }   
}