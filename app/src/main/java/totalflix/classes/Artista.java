package totalflix.classes;

import java.time.LocalDate;

public class Artista {

    private int idArtista;
    private String nomeArtista;
    protected String biografia;
    private LocalDate dataNascimento;
    private LocalDate dataFalecimento;

    public Artista(int idArtista, String nomeArtista, String biografia, LocalDate dataNascArtista,
            LocalDate dataFalecimento) {
        this.idArtista = idArtista;
        this.nomeArtista = nomeArtista;
        this.biografia = biografia;
        this.dataNascimento = dataNascArtista;
        this.dataFalecimento = dataFalecimento;
    }

    public int getIdArtista() {
        return idArtista;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public String getBiografia() {
        return biografia;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public LocalDate getDataFalecimento() {
        return dataFalecimento;
    }

    public void setIdArtista(int idArtista) {
        this.idArtista = idArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public void setDataNascimento(LocalDate dataNascArtista) {
        this.dataNascimento = dataNascArtista;
    }

    public void setDataFalecimento(LocalDate dataFalecimento) {
        this.dataFalecimento = dataFalecimento;
    }
}
