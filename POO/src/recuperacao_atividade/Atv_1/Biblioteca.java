package recuperacao_atividade.Atv_1;

public class Biblioteca {
    // Estrutura de atributos privados
    private String tituloLivro;
    private String autor;
    private int anoPublicacao;

    public Biblioteca (String tituloLivro, String autor, int anoPublicacao){

        this.tituloLivro = tituloLivro;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

    public Biblioteca() {

    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "tituloLivro='" + tituloLivro + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}