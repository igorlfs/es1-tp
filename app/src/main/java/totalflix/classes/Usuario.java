package totalflix.classes;

public class Usuario extends Pessoa {

    private boolean assinaturaAtiva;
    private String dataAssinatura;
    private MetodoPgto metodoPgto;
    private boolean mesGratuito;

    public Usuario(final int id, final String cpf, final String nome, final String dataNascimento, final String email,
            final String senha, final String endereco,
            final String dataCriacao, final String dataAssinatura, final boolean assinaturaAtiva,
            final MetodoPgto metodoPgto) {
        super(id, cpf, nome, dataNascimento, email, senha, endereco, dataCriacao);
        this.assinaturaAtiva = assinaturaAtiva;
        this.dataAssinatura = dataAssinatura;
        this.metodoPgto = metodoPgto;
        this.mesGratuito = true;
    }

    public MetodoPgto getMetodoPgto() {
        return metodoPgto;
    }

    public void setMetodoPgto(final MetodoPgto metodoPgto) {
        this.metodoPgto = metodoPgto;
    }

    public boolean isMesGratuitoAtivo() {
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

    public void setDataAssinatura(final String dataAssinatura) {
        this.dataAssinatura = dataAssinatura;
    }

    public boolean isAssinaturaAtiva() {
        return assinaturaAtiva;
    }

}
