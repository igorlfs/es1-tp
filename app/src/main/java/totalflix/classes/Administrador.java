package totalflix.classes;

public class Administrador extends Pessoa {

    private int nivelAcesso;
    private String cargo;

    public Administrador(final int id, final String cpf, final String nome, final String dataNascimento,
            final String email, final String senha,
            final String endereco, final String dataCriacao, final int nivelAcesso, final String cargo) {
        super(id, cpf, nome, dataNascimento, email, senha, endereco, dataCriacao);
        this.nivelAcesso = nivelAcesso;
        this.cargo = cargo;
    }

    public void setCargo(final String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setNivelAcesso(final int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(final String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
