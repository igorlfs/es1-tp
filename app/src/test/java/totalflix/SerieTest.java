package totalflix;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import totalflix.classes.Artista;
import totalflix.classes.Classificacao;
import totalflix.classes.Episodio;
import totalflix.classes.Serie;

public class SerieTest {

    @Test
    public void testConstructor() {
        final ArrayList<Artista> artistas = new ArrayList<>();
        artistas.add(new Artista(1, "João da Silva", "Biografia de João da Silva", "01/01/1900", "01/01/2000"));

        final ArrayList<Episodio> episodios = new ArrayList<>();
        episodios.add(new Episodio(1, 60, 1, 1, "01/01/2020", "Título do episódio 1", "Descrição do episódio 1"));

        final ArrayList<String> audios = new ArrayList<>();
        audios.add("Português");
        audios.add("Ingles");

        final ArrayList<String> legendas = new ArrayList<>();
        legendas.add("Japonês");
        legendas.add("Inglês");
        final Serie serie = new Serie(1, "Título da série", "Descrição da série", "Categoria da série", 2020,
                "Produtora da série", 10, 2, episodios, Classificacao.C16, artistas, legendas, audios);

        assertEquals(1, serie.getIdConteudo());
        assertEquals("Título da série", serie.getTitulo());
        assertEquals("Descrição da série", serie.getDescricao());
        assertEquals("Categoria da série", serie.getCategoria());
        assertEquals(2020, serie.getAnoLancamento());
        assertEquals("Produtora da série", serie.getProdutora());
        assertEquals(Classificacao.C16, serie.getClassificacao());
        assertEquals(10, serie.getQtdEps());
        assertEquals(2, serie.getQtdTemps());
        assertEquals(1, serie.getArtistas().size());
        assertEquals(1, serie.getEpisodios().size());
    }

    @Test
    public void testSerieEpisodio() {
        final ArrayList<Artista> artistas = new ArrayList<>();
        artistas.add(new Artista(1, "João da Silva", "Biografia de João da Silva", "01/01/1900", "01/01/2000"));

        final ArrayList<Episodio> episodios = new ArrayList<>();
        episodios.add(new Episodio(1, 60, 1, 1, "01/01/2020", "Título do episódio 1", "Descrição do episódio 1"));
        final ArrayList<String> audios = new ArrayList<>();
        audios.add("Português");
        audios.add("Ingles");

        final ArrayList<String> legendas = new ArrayList<>();
        legendas.add("Japonês");
        legendas.add("Inglês");
        final Serie serie = new Serie(1, "Título da série", "Descrição da série", "Categoria da série", 2020,
                "Produtora da série", 10, 2, episodios, Classificacao.C16, artistas, legendas, audios);
        for (final Episodio episodio : serie.getEpisodios()) {
            assertEquals("Título do episódio 1", episodio.getTituloEp());
        }
    }
}
