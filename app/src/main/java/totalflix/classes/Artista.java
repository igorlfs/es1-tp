package totalflix.classes;

public class Artista {

	private int idArtista;
	private String nomeArtista;
	private String biografia;
	private String dataNascArtista;
	private String dataFalecimento;

	public Artista(int idArtista, String nomeArtista, String biografia, String dataNascArtista, String dataFalecimento) {
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

	public void setNome(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public void setDataFalecimento(String dataFalecimento) {
		this.dataFalecimento = dataFalecimento;
	}
}