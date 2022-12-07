package totalflix.classes;

import java.util.ArrayList;

public class SistemaStreaming {

    private boolean logado;
    private Pessoa pessoaLogada;
    private ArrayList<Pessoa> pessoas;
    private ArrayList<Conteudo> conteudos;

    public Pessoa gePessoaLogada() {
        return pessoaLogada;
    }

    public void setPessoaLogada(Pessoa pessoaLogada) {
        this.pessoaLogada = pessoaLogada;
    }

    private static SistemaStreaming sistemaInstancia = new SistemaStreaming();

    // Será implementado no futuro
    private SistemaStreaming() {
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public void setConteudos(ArrayList<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public static SistemaStreaming getInstance() {
        return sistemaInstancia;
    }

    public void addUsuario(Usuario usuario) {
        pessoas.add(usuario);
    }

    public void addConteudo(Conteudo conteudo) {
        conteudos.add(conteudo);
    }

    public void fazerLogin(String email, String senha) {
        for (Pessoa pessoa : pessoas) {
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

    public void alertLogado(String alert) {
        if (logado)
            System.out.println(alert + " logado: " + pessoaLogada.getNome());
        else
            System.out.println("Nenhum " + alert + " logado");
    }

    public void listarConteudos() {
        System.out.println("Conteúdos: \n");
        String tipo;
        for (Conteudo conteudo : conteudos) {
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
            for (Pessoa pessoa : pessoas) {
                System.out.println("Nome: " + pessoa.getNome() + "\n");
            }
        } else {
            System.out.println("Apenas administradores podem ver a listagem de usuários");
        }
    }
}
