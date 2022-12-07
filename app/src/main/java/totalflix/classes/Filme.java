package totalflix.classes;

import java.util.ArrayList;

public class Filme extends Conteudo {

    private int duracao;
    private String categoria;

    public Filme(int idConteudo, String titulo, String descricao, String categoria, int anoLancamento, String produtora,
            int duracao, Classificacao classificacao, ArrayList<Artista> artistas, ArrayList<String> legendas,
            ArrayList<String> audios) {
        super(idConteudo, titulo, descricao, categoria, anoLancamento, produtora, classificacao, artistas, legendas,
                audios);
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
