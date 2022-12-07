package totalflix.classes;

import java.util.ArrayList;

public class Serie extends Conteudo {

    private final int qtdEps;
    private final int qtdTemps;
    private ArrayList<Episodio> episodios;

    public Serie(final int idConteudo, final String titulo, final String descricao, final String categoria,
            final int anoLancamento, final String produtora,
            final int qtdEps, final int qtdTemps, final ArrayList<Episodio> episodios,
            final Classificacao classificacao,
            final ArrayList<Artista> artistas, final ArrayList<String> legendas, final ArrayList<String> audios) {
        super(idConteudo, titulo, descricao, categoria, anoLancamento, produtora, classificacao, artistas, legendas,
                audios);
        this.qtdEps = qtdEps;
        this.qtdTemps = qtdTemps;
        this.episodios = episodios;
    }

    public int getQtdEps() {
        return qtdEps;
    }

    public int getQtdTemps() {
        return qtdTemps;
    }

    public int setQtdEps(final int qtdEps) {
        return qtdEps;
    }

    public int setQtdTemps(final int qtdTemps) {
        return qtdTemps;
    }

    public ArrayList<Episodio> getEpisodios() {
        return episodios;
    }

    public void setEpisodios(final ArrayList<Episodio> episodios) {
        this.episodios = episodios;
    }
}
