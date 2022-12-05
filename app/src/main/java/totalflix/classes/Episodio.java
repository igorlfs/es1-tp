package totalflix.classes;

public class Episodio {

    private int idEp;
    private int duracaoEp;
    private int temporada;
    private int idSerie;
    protected int numEp;
    protected LocalDate dataLancamento;
    protected String tituloEp;
    protected String descricaoEp;

    public Episodio(int idEp, int duracaoEp, int temporada, int idSerie, int numEp, LocalDate dataLancamento, String tituloEp, String descricaoEp) {
        this.idEp = idEp;
        this.duracaoEp = duracaoEp;
        this.temporada = temporada;
        this.idSerie = idSerie;
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

    public int getIdSerie() {
        return idSerie;
    }

    public int getNumEp() {
        return numEp;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public String getTituloEp() {
        return tituloEp;
    }

    public String getDescricaoEp() {
        return descricaoEp;
    }

    public String mudarTitulo(String tituloEp) {
        this.tituloEp = tituloEp;
    }

    public String mudarDescricao(String descricaoEp) {
        this.descricaoEp = descricaoEp;
    }

    public LocalDate mudarDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public int mudarNumEp(int numEp) {
        this.numEp = numEp;
    }

    public int mudarDuracao(int duracaoEp) {
        this.duracaoEp = duracaoEp;
    }
}