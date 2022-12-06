package totalflix.classes;

public class Usuario extends Pessoa {

	private boolean assinaturaAtiva;
	private String dataAssinatura;
	private MetodoPgto metodoPgto;
	private boolean mesGratuito;

	public MetodoPgto getMetodoPgto() {
		return metodoPgto;
	}

	public void setMetodoPgto(MetodoPgto metodoPgto) {
		this.metodoPgto = metodoPgto;
	}

	public Usuario(int id, String cpf, String nome, String dataNascimento, String email, String senha, String endereco, String dataCriacao,String dataAssinatura,boolean assinaturaAtiva,MetodoPgto metodoPgto) {
		super(id, cpf, nome, dataNascimento, email, senha, endereco, dataCriacao);
		this.assinaturaAtiva = assinaturaAtiva;
		this.dataAssinatura = dataAssinatura;
		this.metodoPgto = metodoPgto;
		this.mesGratuito = true;
	}

	public boolean isMesGratuito() {
		return mesGratuito;
	}

	public void encerrarGratuitade() {
		this.mesGratuito = false;
	}

	public void desativarAssinatura() {
		this.assinaturaAtiva = false;
	}

	public void ativarAssinatura() {
		this.assinaturaAtiva = true;
	}

	public String getDataAssinatura() {
		return dataAssinatura;
	}

	public void setDataAssinatura(String dataAssinatura) {
		this.dataAssinatura = dataAssinatura;
	}

	public boolean isAssinaturaAtiva() {
		return assinaturaAtiva;
	}

}
