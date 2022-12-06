package totalflix.classes;

import java.util.ArrayList;

public class Serie extends Conteudo {

	private int qtdEps;
	private int qtdTemps;
	private ArrayList<Episodio> episodios;

	public Serie(int idConteudo, String titulo, String descricao, String categoria, int anoLancamento, String produtora, int qtdEps, int qtdTemps,ArrayList<Episodio> episodios,Classificacao classificacao,ArrayList<Artista> artistas,ArrayList<String> legendas,ArrayList<String> audios) {
		super(idConteudo, titulo, descricao, categoria, anoLancamento, produtora,classificacao,artistas,legendas,audios);
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

	public int setQtdEps(int qtdEps) {
		return qtdEps;
	}

	public int setQtdTemps(int qtdTemps) {
		return qtdTemps;
	}

	public ArrayList<Episodio> getEpisodios(){
		return episodios;
	}

	public void setEpisodios(ArrayList<Episodio> episodios) {
		this.episodios = episodios;
	}
}