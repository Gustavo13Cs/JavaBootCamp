package main.java.list.Pesquisa;

public class Livro {
    //atributos 

    private String titulo;
    private String autor;
    private int anoPubicacao;

    public Livro(String titulo,String autor, int anoPubicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPubicacao = anoPubicacao;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnoPublicacao() {
        return anoPubicacao;
    }

    @Override
    public String toString() {
    return "Livro{" +
        "titulo='" + titulo + '\'' +
        ", autor='" + autor + '\'' +
        ", anoPublicacao=" + anoPubicacao +
        '}';
    }


}
