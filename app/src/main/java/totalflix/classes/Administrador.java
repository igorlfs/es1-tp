package totalflix.classes;

public class Administrador extends Pessoa {

    private int nivelAcesso;
    private String cargo;
    private String dataAdmissao;

    public Administrador(int id, String cpf, String nome, String dataNascimento, String email, String senha,
            String endereco, String dataCriacao) {
        super(id, cpf, nome, dataNascimento, email, senha, endereco, dataCriacao);
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public String getCargo() {
        return cargo;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

}
