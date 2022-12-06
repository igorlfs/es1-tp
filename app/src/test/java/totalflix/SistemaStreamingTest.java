package totalflix;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import totalflix.classes.Artista;
import totalflix.classes.Classificacao;
import totalflix.classes.Conteudo;
import totalflix.classes.Episodio;
import totalflix.classes.Filme;
import totalflix.classes.MetodoPgto;
import totalflix.classes.Pessoa;
import totalflix.classes.Serie;
import totalflix.classes.SistemaStreaming;
import totalflix.classes.Usuario;

public class SistemaStreamingTest {

	private static ArrayList<Pessoa> gerarUsuarios(){
		Usuario usuario1 = new Usuario(1, "59564898048", "Joao da Silva", "01/01/1990", "joao.silva@gmail.com", "senha123", "Rua das Flores, 123, São Paulo, SP", "10/10/2020", "10/10/2020", true,MetodoPgto.BOLETO_BANCARIO);
		Usuario usuario2 = new Usuario(2, "93769781023", "Maria Souza", "05/05/1995", "maria.souza@gmail.com", "senha456", "Rua dos Pássaros, 456, Rio de Janeiro, RJ", "11/11/2020", "11/11/2020", true,MetodoPgto.BOLETO_BANCARIO);
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(usuario1);
		pessoas.add(usuario2);
		return pessoas;
	}

	private static ArrayList<Conteudo> gerarConteudos(){
		Artista artista1 = new Artista(1, "Marlon Brando", "Marlon Brando Jr. foi um ator estadunidense, considerado um dos maiores atores de todos os tempos. Ele venceu o Oscar de Melhor Ator duas vezes, por seus papéis em A Malvada e O Poderoso Chefão.", "03/04/1924", "01/07/2004");
		Artista artista2 = new Artista(2, "Audrey Hepburn", "Audrey Hepburn foi uma atriz britânica e filantropa, considerada uma das mais importantes e icônicas figuras do cinema mundial. Ela venceu o Oscar de Melhor Atriz em 1954, por seu papel em Bonequinha de Luxo.", "04/05/1929", "20/01/1993");
		ArrayList<Artista> artistas1 = new ArrayList<Artista>();
		artistas1.add(artista1);
		artistas1.add(artista2);

		ArrayList<String> audios = new ArrayList<>();
		audios.add("Português");
		audios.add("Ingles");

		ArrayList<String> legendas = new ArrayList<>();
		legendas.add("Japonês");
		legendas.add("Inglês");
		Filme filme1 = new Filme(1, "O Poderoso Chefão", "O Poderoso Chefão é um filme de 1972 dirigido por Francis Ford Coppola e baseado no romance homônimo de Mario Puzo. O filme conta a história da família mafiosa Corleone e seus negócios ilegais, traições e rivalidades.", "Drama", 1972, "Paramount Pictures",140,Classificacao.LIVRE, artistas1,legendas,audios);
		Filme filme6 = new Filme(6, "E o Vento Levou", "E o Vento Levou é um filme de 1939 dirigido por Victor Fleming e baseado no romance homônimo de Margaret Mitchell. O filme conta a história de Scarlett O'Hara, uma jovem da alta sociedade sulista que luta para salvar sua fazenda e seus entes queridos durante a Guerra Civil Americana.", "Drama", 1939, "Selznick International Pictures",130,Classificacao.C18, artistas1,legendas,audios);
		ArrayList<Episodio> episodios = new ArrayList<Episodio>();
		episodios.add(new Episodio(1, 53,2, 1, "01/04/2012", "The North Remembers", "O primeiro episódio da segunda temporada"));
		episodios.add(new Episodio(2, 53,2, 2, "08/04/2012", "The Night Lands", "O segundo episódio da segunda temporada"));

		ArrayList<Artista> artistas4 = new ArrayList<Artista>();
		artistas4.add(new Artista(1, "Peter Dinklage", "Ator americano", "11/06/1969", null));
		artistas4.add(new Artista(2, "Lena Headey", "Atriz britânica", "03/10/1973", null));
		Serie serie = new Serie(1, "Game of Thrones", "Série de TV americana baseada na série de livros As Crônicas de Gelo e Fogo", "Drama", 2011, "HBO", 10, 2, episodios, Classificacao.C16, artistas4,legendas,audios);


		ArrayList<Conteudo> conteudos = new ArrayList<Conteudo>();

		conteudos.add(filme1);
		conteudos.add(filme6);
		conteudos.add(serie);

		return conteudos;
	}

	@BeforeClass
	public static void oneTimeSetUp() {
		ArrayList<Pessoa> pessoas = gerarUsuarios();
		ArrayList<Conteudo> conteudos = gerarConteudos();

		SistemaStreaming sistemaStreaming = SistemaStreaming.getInstance();
		sistemaStreaming.setPessoas(pessoas);
		sistemaStreaming.setConteudos(conteudos);

		sistemaStreaming.fazerLogin("maria.souza@gmail.com", "senha456");
	}

	@Test
	public void testLogin() {
		SistemaStreaming sistemaStreaming = SistemaStreaming.getInstance();
		assertEquals(true,sistemaStreaming.isLogado());
		assertEquals("Maria Souza",sistemaStreaming.gePessoaLogada().getNome());
	}

	@Test
	public void testLogout() {
		SistemaStreaming sistemaStreaming = SistemaStreaming.getInstance();
		sistemaStreaming.fazerLogout();
		assertEquals(false,sistemaStreaming.isLogado());
		assertNull(sistemaStreaming.gePessoaLogada());
	}
	
}
