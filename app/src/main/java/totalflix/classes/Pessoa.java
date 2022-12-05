package totalflix.classes;

public class Pessoa {

    private int id;
    private String cpf;
    protected String nome;
    protected String dataNascimento;
    private String email;
    private String senha;
    private String endereco;
    private String dataAdmissao;

    public Pessoa(int id, String cpf, String nome, String dataNascimento, String email, String senha, String endereco, String dataAdmissao) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.dataAdmissao = dataAdmissao;
    }
    
    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void getDataAdmissao() {
        return dataAdmissao;
    }

    public void mudarSenha(String senha) {
        this.senha = senha;
    }

    public void mudarEmail(String email) {
        this.email = email;
    }

    public void mudarEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void mudarNome(String nome) {
        this.nome = nome;
    }
}
