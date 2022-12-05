package totalflix.classes;

public class Filme extends Conteudo {

    private int duracao;
    private String categoria;

    public Filme(int idConteudo, String titulo, String descricao, String categoria, int anoLancamento, String produtora, int duracao) {
        super(idConteudo, titulo, descricao, categoria, anoLancamento, produtora);
        this.duracao = duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getDuracao() {
        return duracao;
    }
    
    public String getCategoria() {
        return categoria;
    }
}