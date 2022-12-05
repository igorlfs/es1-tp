package totalflix.classes;

public class Artista {

    private int idArtista;
    private String nomeArtista;
    protected String biografia;
    private LocalDate dataNascArtista;
    private LocalDate dataFalecimento;

    public Artista(int idArtista, String nomeArtista, String biografia, LocalDate dataNascArtista, LocalDate dataFalecimento) {
        this.idArtista = idArtista;
        this.nomeArtista = nomeArtista;
        this.biografia = biografia;
        this.dataNascArtista = dataNascArtista;
        this.dataFalecimento = dataFalecimento;
    }

    public int getIdArtista() {
        return idArtista;
    }

    public LocalDate getDataFalecimento() {
        return dataFalecimento;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public String getBiografia() {
        return biografia;
    }

    public LocalDate getDataNascArtista() {
        return dataNascArtista;
    }

    public String mudarNome(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public String mudarBiografia(String biografia) {
        this.biografia = biografia;
    }
    
    public LocalDate setDataFalecimento(LocalDate dataFalecimento) {
        this.dataFalecimento = dataFalecimento;
    }
}