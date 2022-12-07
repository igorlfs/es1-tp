package totalflix.classes;

public class Episodio {

    private int idEp;
    private int duracaoEp;
    private int temporada;
    private int numEp;
    private String dataLancamento;
    private String tituloEp;
    private String descricaoEp;

    public Episodio(int idEp, int duracaoEp, int temporada, int numEp, String dataLancamento, String tituloEp,
            String descricaoEp) {
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

    public void setTitulo(String tituloEp) {
        this.tituloEp = tituloEp;
    }

    public void setDescricao(String descricaoEp) {
        this.descricaoEp = descricaoEp;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public void setNumEp(int numEp) {
        this.numEp = numEp;
    }

    public void setDuracao(int duracaoEp) {
        this.duracaoEp = duracaoEp;
    }
}
