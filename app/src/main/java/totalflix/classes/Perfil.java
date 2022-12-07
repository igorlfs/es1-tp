package totalflix.classes;

import java.util.ArrayList;

public class Perfil {

    private String nomePerfil;
    private boolean restricaoInfantil;
    private ArrayList<Conteudo> historico;

    public Perfil(final String nomePerfil, final boolean restricaoInfantil) {
        this.nomePerfil = nomePerfil;
        this.restricaoInfantil = restricaoInfantil;
    }

    public boolean getRestricaoInfantil() {
        return restricaoInfantil;
    }

    public void setRestricaoInfantil(final boolean restricaoInfantil) {
        this.restricaoInfantil = restricaoInfantil;
    }

    public String getNomePerfil() {
        return nomePerfil;
    }

    public void setNomePerfil(final String nomePerfil) {
        this.nomePerfil = nomePerfil;
    }

    public ArrayList<Conteudo> getHistorico() {
        return historico;
    }

    public void setHistorico(final ArrayList<Conteudo> historico) {
        this.historico = historico;
    }

    public void addConteudoHistorico(final Conteudo conteudo) {
        this.historico.add(conteudo);
    }
}
