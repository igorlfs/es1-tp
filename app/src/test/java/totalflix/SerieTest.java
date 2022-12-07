package totalflix;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import totalflix.classes.Artista;
import totalflix.classes.Classificacao;
import totalflix.classes.Episodio;
import totalflix.classes.Serie;

public class SerieTest {

    public void testConstructor() {
        ArrayList<Artista> artistas = new ArrayList<>();
        artistas.add(new Artista(1, "João da Silva", "Biografia de João da Silva", "01/01/1900", "01/01/2000"));

        ArrayList<Episodio> episodios = new ArrayList<>();
        episodios.add(new Episodio(1, 60, 1, 1, "01/01/2020", "Título do episódio 1", "Descrição do episódio 1"));

        ArrayList<String> audios = new ArrayList<>();
        audios.add("Português");
        audios.add("Ingles");

        ArrayList<String> legendas = new ArrayList<>();
        legendas.add("Japonês");
        legendas.add("Inglês");
        Serie serie = new Serie(1, "Título da série", "Descrição da série", "Categoria da série", 2020,
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
        ArrayList<Artista> artistas = new ArrayList<>();
        artistas.add(new Artista(1, "João da Silva", "Biografia de João da Silva", "01/01/1900", "01/01/2000"));

        ArrayList<Episodio> episodios = new ArrayList<>();
        episodios.add(new Episodio(1, 60, 1, 1, "01/01/2020", "Título do episódio 1", "Descrição do episódio 1"));
        ArrayList<String> audios = new ArrayList<>();
        audios.add("Português");
        audios.add("Ingles");

        ArrayList<String> legendas = new ArrayList<>();
        legendas.add("Japonês");
        legendas.add("Inglês");
        Serie serie = new Serie(1, "Título da série", "Descrição da série", "Categoria da série", 2020,
                "Produtora da série", 10, 2, episodios, Classificacao.C16, artistas, legendas, audios);
        for (Episodio episodio : serie.getEpisodios()) {
            assertEquals("Título do episódio 1", episodio.getTituloEp());
        }
    }
}
