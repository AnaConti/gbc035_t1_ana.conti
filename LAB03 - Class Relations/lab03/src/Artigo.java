public class Artigo {
    //ex 01
    /*
    private String titulo, resumo, texto;

    public Artigo(String titulo, String resumo, String texto){
        this.titulo=titulo;
        this.resumo=resumo;
        this.texto=texto;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    */



    //ex02
    /*
    private String titulo, resumo, texto;

    private Autor autor1;

    public Artigo(String titulo, String resumo, String texto, Autor autor1){
        this.titulo=titulo;
        this.resumo=resumo;
        this.texto=texto;
        this.autor1=autor1;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setAutor1(Autor autor1) {
        this.autor1 = autor1;
    }

    public Autor getAutor1() {
        return autor1;
    }
    */



    //ex03
    private String titulo, resumo, texto;

    private Autor[] autores;

    public Artigo(String titulo, String resumo, String texto, Autor[] autores){
        this.titulo=titulo;
        this.resumo=resumo;
        this.texto=texto;
        this.autores=autores;
        
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setAutores(Autor[] autores) {
        this.autores = autores;
    }

    public Autor[] getAutores() {
        return autores;
    }

    
}
