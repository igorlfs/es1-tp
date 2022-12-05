package totalflix.classes;

public class Conteudo {

    private int idConteudo;
    protected String titulo;
    protected String descricao;
    protected String categoria;
    protected int anoLancamento;
    protected String produtora;

    public Conteudo(int idConteudo, String titulo, String descricao, String categoria, int anoLancamento,
            String produtora) {
        this.idConteudo = idConteudo;
        this.titulo = titulo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.anoLancamento = anoLancamento;
        this.produtora = produtora;
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
}
