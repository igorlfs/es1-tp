package totalflix.classes;

public class Artista {

    private final int idArtista;
    private String nomeArtista;
    private String biografia;
    private final String dataNascArtista;
    private String dataFalecimento;

    public Artista(final int idArtista, final String nomeArtista, final String biografia, final String dataNascArtista,
            final String dataFalecimento) {
        this.idArtista = idArtista;
        this.nomeArtista = nomeArtista;
        this.biografia = biografia;
        this.dataNascArtista = dataNascArtista;
        this.dataFalecimento = dataFalecimento;
    }

    public int getIdArtista() {
        return idArtista;
    }

    public String getDataFalecimento() {
        return dataFalecimento;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public String getBiografia() {
        return biografia;
    }

    public String getDataNascArtista() {
        return dataNascArtista;
    }

    public void setNome(final String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public void setBiografia(final String biografia) {
        this.biografia = biografia;
    }

    public void setDataFalecimento(final String dataFalecimento) {
        this.dataFalecimento = dataFalecimento;
    }
}
