package totalflix.classes;

import java.time.LocalDate;

public class Episodio {

    private int idEp;
    private int duracaoEp;
    private int temporada;
    private int idSerie;
    protected int numEp;
    protected LocalDate dataLancamento;
    protected String tituloEp;
    protected String descricaoEp;

    public Episodio(int idEp, int duracaoEp, int temporada, int idSerie, int numEp, LocalDate dataLancamento,
            String tituloEp, String descricaoEp) {
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

    public void setIdEp(int idEp) {
        this.idEp = idEp;
    }

    public void setDuracaoEp(int duracaoEp) {
        this.duracaoEp = duracaoEp;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public void setIdSerie(int idSerie) {
        this.idSerie = idSerie;
    }

    public void setNumEp(int numEp) {
        this.numEp = numEp;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public void setTituloEp(String tituloEp) {
        this.tituloEp = tituloEp;
    }

    public void setDescricaoEp(String descricaoEp) {
        this.descricaoEp = descricaoEp;
    }

}
