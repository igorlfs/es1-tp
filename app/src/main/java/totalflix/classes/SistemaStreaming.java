package totalflix.classes;

import java.util.ArrayList;

public class SistemaStreaming {

    private static SistemaStreaming sistemaInstancia = new SistemaStreaming();

    public static SistemaStreaming getInstance() {
        return sistemaInstancia;
    }

    private boolean logado;
    private Pessoa pessoaLogada;

    private ArrayList<Pessoa> pessoas;

    private ArrayList<Conteudo> conteudos;

    // Será implementado no futuro
    private SistemaStreaming() {
    }

    public Pessoa getPessoaLogada() {
        return pessoaLogada;
    }

    public void setPessoaLogada(final Pessoa pessoaLogada) {
        this.pessoaLogada = pessoaLogada;
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(final boolean logado) {
        this.logado = logado;
    }

    public void setPessoas(final ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public void setConteudos(final ArrayList<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public void addUsuario(final Usuario usuario) {
        pessoas.add(usuario);
    }

    public void addConteudo(final Conteudo conteudo) {
        conteudos.add(conteudo);
    }

    public void fazerLogin(final String email, final String senha) {
        for (final Pessoa pessoa : pessoas) {
            if ((pessoa) instanceof Usuario) {
                if (pessoa.getEmail() == email) {
                    if (pessoa.getSenha() == senha) {
                        logado = true;
                        pessoaLogada = (Usuario) pessoa;
                        alertLogado("Usuario");
                    }
                }
            } else if ((pessoa) instanceof Administrador) {
                if (pessoa.getEmail() == email) {
                    if (pessoa.getSenha() == senha) {
                        logado = true;
                        pessoaLogada = (Administrador) pessoa;
                        alertLogado("Admin");
                    }
                }
            }
        }
    }

    public void fazerLogout() {
        if (logado) {
            System.out.println("Usuário Deslogado");
            this.logado = false;
            this.pessoaLogada = null;
        } else {
            System.out.println("Nenhum usuário logado");
        }
    }

    public void alertLogado(final String alert) {
        if (logado)
            System.out.println(alert + " logado: " + pessoaLogada.getNome());
        else
            System.out.println("Nenhum " + alert + " logado");
    }

    public void listarConteudos() {
        System.out.println("Conteúdos: \n");
        String tipo;
        for (final Conteudo conteudo : conteudos) {
            if ((conteudo) instanceof Filme) {
                tipo = "Filme";
            } else {
                tipo = "Serie";
            }
            System.out.println(tipo + ": " + conteudo.getTitulo() + "\n");
        }
    }

    public void listarUsuarios() {
        if (logado == true && pessoaLogada instanceof Administrador) {
            System.out.println("Usuários: \n");
            for (final Pessoa pessoa : pessoas) {
                System.out.println("Nome: " + pessoa.getNome() + "\n");
            }
        } else {
            System.out.println("Apenas administradores podem ver a listagem de usuários");
        }
    }
}
