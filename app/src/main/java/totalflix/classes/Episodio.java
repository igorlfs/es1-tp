package totalflix.classes;

public class Episodio {

    private final int idEp;
    private int duracaoEp;
    private final int temporada;
    private int numEp;
    private String dataLancamento;
    private String tituloEp;
    private String descricaoEp;

    public Episodio(final int idEp, final int duracaoEp, final int temporada, final int numEp,
            final String dataLancamento, final String tituloEp,
            final String descricaoEp) {
        this.idEp = idEp;
        this.duracaoEp = duracaoEp;
        this.temporada = temporada;
        this.numEp = numEp;
        this.dataLancamento = dataLancamento;
        this.tituloEp = tituloEp;
        this.descricaoEp = descricaoEp;
    }

    public int getIdEp() {
        return idEp;
    }

    public int getDuracaoEp() {
        return duracaoEp;
    }

    public int getTemporada() {
        return temporada;
    }

    public int getNumEp() {
        return numEp;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public String getTituloEp() {
        return tituloEp;
    }

    public String getDescricaoEp() {
        return descricaoEp;
    }

    public void setTitulo(final String tituloEp) {
        this.tituloEp = tituloEp;
    }

    public void setDescricao(final String descricaoEp) {
        this.descricaoEp = descricaoEp;
    }

    public void setDataLancamento(final String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public void setNumEp(final int numEp) {
        this.numEp = numEp;
    }

    public void setDuracao(final int duracaoEp) {
        this.duracaoEp = duracaoEp;
    }
}
