package totalflix.classes;

public class Administrador extends Pessoa {

    private int nivelAcesso;
    private String cargo;

    public Administrador(int id, String cpf, String nome, String dataNascimento, String email, String senha,
            String endereco, String dataCriacao, int nivelAcesso, String cargo) {
        super(id, cpf, nome, dataNascimento, email, senha, endereco, dataCriacao);
        this.nivelAcesso = nivelAcesso;
        this.cargo = cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
