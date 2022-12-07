package totalflix.classes;

import java.util.ArrayList;

public abstract class Pessoa {

    protected int id;
    protected String cpf;
    protected String nome;
    protected String dataNascimento;
    protected String email;
    protected String senha;
    protected String endereco;
    protected String dataAdmissao;
    protected ArrayList<Perfil> perfis;

    public Pessoa(final int id, final String cpf, final String nome, final String dataNascimento, final String email,
            final String senha, final String endereco,
            final String dataAdmissao) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.dataAdmissao = dataAdmissao;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(final String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public void setCpf(final String cpf) {
        this.cpf = cpf;
    }

    public void setDataAdmissao(final String dataAdmissao) {
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

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setSenha(final String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public void setEndereco(final String endereco) {
        this.endereco = endereco;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public ArrayList<Perfil> getPerfis() {
        return perfis;
    }

    public void setPerfis(final ArrayList<Perfil> perfis) {
        this.perfis = perfis;
    }

    public void addPerfil(final Perfil perfil) {
        perfis.add(perfil);
    }

}
