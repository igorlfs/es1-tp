package totalflix.classes;

import java.util.ArrayList;

public abstract class Conteudo {

	private int idConteudo;
	protected String titulo;
	protected String descricao;
	protected String categoria;
	protected int anoLancamento;
	protected String produtora;
	private ArrayList<Artista> artistas;
	private Classificacao classificacao;
	private ArrayList<String> legendas;
	private ArrayList<String> audios;


	public Conteudo(int idConteudo, String titulo, String descricao, String categoria, int anoLancamento, String produtora,Classificacao classificacao,ArrayList<Artista> artistas,ArrayList<String> legendas,ArrayList<String> audios) {
		this.idConteudo = idConteudo;
		this.titulo = titulo;
		this.descricao = descricao;
		this.categoria = categoria;
		this.anoLancamento = anoLancamento;
		this.produtora = produtora;
		this.artistas = artistas;
		this.classificacao = classificacao;
		this.legendas = legendas;
		this.audios = audios;
	}
	public ArrayList<String> getLegendas() {
		return legendas;
	}
	public void setLegendas(ArrayList<String> legendas) {
		this.legendas = legendas;
	}
	public ArrayList<String> getAudios() {
		return audios;
	}
	public void setAudios(ArrayList<String> audios) {
		this.audios = audios;
	}
	public Classificacao getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(Classificacao classificacao) {
		this.classificacao = classificacao;
	}
	public ArrayList<Artista> getArtistas() {
		return artistas;
	}

	public void setArtistas(ArrayList<Artista> artistas) {
		this.artistas = artistas;
	}

	public int getIdConteudo() {
		return idConteudo;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public String getProdutora() {
		return produtora;
	}

	public void setIdConteudo(int idConteudo) {
		this.idConteudo = idConteudo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}
	
	public void addLegenda(String legenda) {
		this.legendas.add(legenda);
	}
}