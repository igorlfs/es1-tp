package totalflix;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import totalflix.classes.Episodio;

public class EpisodioTest {
    @Test
    public void testConstructor() {
        final Episodio episodio = new Episodio(1, 53, 2, 1, "01/04/2012", "The North Remembers",
                "O primeiro episódio da segunda temporada");
        assertEquals(1, episodio.getIdEp());
        assertEquals(53, episodio.getDuracaoEp());
        assertEquals(2, episodio.getTemporada());
        assertEquals(1, episodio.getNumEp());
        assertEquals("01/04/2012", episodio.getDataLancamento());
        assertEquals("The North Remembers", episodio.getTituloEp());
        assertEquals("O primeiro episódio da segunda temporada", episodio.getDescricaoEp());
    }
}
