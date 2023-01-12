package aula_9;

public class Livro implements Interface {
    private String titulo,autor;
    private int totPaginas,pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    // METODO DETALHES
    public void detalhes(){
        System.out.println("Titulo: "+ this.getTitulo());
        System.out.println("Autor: "+ this.getAutor());
        System.out.println("Total Paginas: "+ this.getTotPaginas());
        System.out.println("Pag Atual: "+ this.getPagAtual());
        System.out.println("Aberto? "+ this.getAberto());
        System.out.println("Leitor: "+ this.getLeitor().getNome());
    }

    // METODO CONSTRUTOR
    public Livro(String titulo,String autor,int totpg,Pessoa leitor){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totpg);
        this.setPagAtual(0);
        this.setLeitor(leitor);
        this.setAberto(false);
    }

    // METODOS GETTER
    private String getTitulo(){
        return this.titulo;
    }
    private String getAutor(){
        return this.autor;
    }
    private int getTotPaginas(){
        return this.totPaginas;
    }
    private int getPagAtual(){
        return this.pagAtual;
    }
    private boolean getAberto(){
        return this.aberto;
    }
    private Pessoa getLeitor(){
        return this.leitor;
    }
    
    // METODOS SETTER
    private void setTitulo(String titulo){
        this.titulo = titulo;
    }
    private void setAutor(String autor){
        this.autor = autor;
    }
    private void setTotPaginas(int total){
        this.totPaginas = total;
    }
    private void setPagAtual(int pgAtual){
        this.pagAtual = pgAtual;
    }
    private void setAberto(boolean aberto){
        this.aberto = aberto;
    }
    private void setLeitor(Pessoa leitor){
        this.leitor = leitor;
    }

    // METODOS DE INTERFACE
    @Override
    public void abrir() {
        this.setAberto(true);        
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int pagina) {
        if(pagina >= 0 && pagina <= this.getTotPaginas()){
            this.setPagAtual(pagina);        
        }
    }

    @Override
    public void avançarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() - 1);
    }

}
