package totalflix.classes;

public class Administrador extends Pessoa {
    
    private int nivelAcesso;
    private String cargo;
    private LocalDate dataAdmissao;
    
    public Administrador(int id, String cpf, String nome, String dataNascimento, String email, String senha, String endereco, String dataCriacao) {
        super(id, cpf, nome, dataNascimento, email, senha, endereco, dataCriacao);
    }

    public void mudarCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void mudarNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
