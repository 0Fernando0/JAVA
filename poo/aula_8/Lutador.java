package aula_8;

public class Lutador implements Interface {
    
    // ATRIBUTOS
    private String nome,nacionalidade,categoria;
    private byte idade;
    private float altura,peso;
    private int vitorias,derrotas,empates;
    
    // METODOS CONSTRUTOR
    public Lutador(String name,String nc,byte id,float al,float pe,int vito,int der,int emp){
        this.setNome(name);
        this.setNacionalidade(nc);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vito);
        this.setDerrotas(der);
        this.setEmpates(emp);
    }

    // METODOS GETTER
    public String getNome(){
        return this.nome;
    }
    private String getNacionalidade(){
        return this.nacionalidade;
    }
    private byte getIdade(){
        return this.idade;
    }
    private float getAltura(){
        return this.altura;
    }
    private float getPeso(){
        return this.peso;
    }
    public String getCategoria(){
        return this.categoria;
    }
    private int getVitorias(){
        return this.vitorias;
    }
    private int getDerrotas(){
        return this.derrotas;
    }
    private int getEmpates(){
        return this.empates;
    }
    // METODOS SETTER
    private void setNome(String name){
        this.nome = name;
    }
    private void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    private void setIdade(byte idade){
        this.idade = idade;
    }
    private void setAltura(float al){
        this.altura = al;
    }
    private void setPeso(float peso){
        this.peso = peso;
        this.setCategoria();
    }
    private void setCategoria(){
        if(this.getPeso() < 52.2 || this.getPeso() > 120.2){
            this.categoria = "invalido";
        }
        else if(this.getPeso() <= 70.3){
            this.categoria = "leve";
        }
        else if(this.getPeso() <= 83.9){
            this.categoria = "médio";
        }
        else{
            this.categoria = "pesado";
        }
    }
    private void setVitorias(int vitoria){
        this.vitorias = vitoria;
    }
    private void setDerrotas(int derrota){
        this.derrotas = derrota;
    }
    private void setEmpates(int empates){
        this.empates = empates;
    }

    // METODOS DE INTERFACE
    @Override
    public void apresentação() {
        System.out.println("Lutador: "+ this.getNome());
        System.out.println("Origer: "+ this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println(this.getAltura()+ " m de altura");
        System.out.println("Pesando "+ this.getPeso() + "kg");
        System.out.println("Ganhou: "+ this.getVitorias());
        System.out.println("Perdeu: "+ this.getDerrotas());
        System.out.println("Empatou: "+ this.getEmpates());
    }

    @Override
    public void status() {
        System.out.println("#".repeat(30));
        System.out.println(this.getNome());
        System.out.println("é um peso "+ this.getCategoria());  
        System.out.println(this.getVitorias()+ " vitórias");
        System.out.println(this.getDerrotas()+ " derrotas");
        System.out.println(this.getEmpates()+ " empates");
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);        
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);        
    }

}
