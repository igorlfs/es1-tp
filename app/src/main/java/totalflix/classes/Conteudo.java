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

    public Conteudo(final int idConteudo, final String titulo, final String descricao, final String categoria,
            final int anoLancamento,
            final String produtora, final Classificacao classificacao, final ArrayList<Artista> artistas,
            final ArrayList<String> legendas,
            final ArrayList<String> audios) {
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

    public void setLegendas(final ArrayList<String> legendas) {
        this.legendas = legendas;
    }

    public ArrayList<String> getAudios() {
        return audios;
    }

    public void setAudios(final ArrayList<String> audios) {
        this.audios = audios;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(final Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(final ArrayList<Artista> artistas) {
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

    public void setIdConteudo(final int idConteudo) {
        this.idConteudo = idConteudo;
    }

    public void setTitulo(final String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(final String descricao) {
        this.descricao = descricao;
    }

    public void setCategoria(final String categoria) {
        this.categoria = categoria;
    }

    public void setAnoLancamento(final int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setProdutora(final String produtora) {
        this.produtora = produtora;
    }

    public void addLegenda(final String legenda) {
        this.legendas.add(legenda);
    }
}
