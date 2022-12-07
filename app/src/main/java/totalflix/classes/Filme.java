package totalflix.classes;

import java.util.ArrayList;

public class Filme extends Conteudo {

    private int duracao;
    private String categoria;

    public Filme(final int idConteudo, final String titulo, final String descricao, final String categoria,
            final int anoLancamento, final String produtora,
            final int duracao, final Classificacao classificacao, final ArrayList<Artista> artistas,
            final ArrayList<String> legendas,
            final ArrayList<String> audios) {
        super(idConteudo, titulo, descricao, categoria, anoLancamento, produtora, classificacao, artistas, legendas,
                audios);
        this.duracao = duracao;
    }

    public void setDuracao(final int duracao) {
        this.duracao = duracao;
    }

    public void setCategoria(final String categoria) {
        this.categoria = categoria;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getCategoria() {
        return categoria;
    }
}
