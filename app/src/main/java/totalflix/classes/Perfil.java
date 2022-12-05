package totalflix.classes;

public class Perfil {

    protected String nomePerfil;
    private boolean restricaoInfantil;
    protected int[] historico;

    public Perfil(String nomePerfil, boolean restricaoInfantil) {
        this.nomePerfil = nomePerfil;
        this.restricaoInfantil = restricaoInfantil;
    }

    public String getNomePerfil() {
        return nomePerfil;
    }

    public boolean isRestricaoInfantil() {
        return restricaoInfantil;
    }

    public int[] getHistorico() {
        return historico;
    }

    public void setNomePerfil(String nomePerfil) {
        this.nomePerfil = nomePerfil;
    }

    public void setRestricaoInfantil(boolean restricaoInfantil) {
        this.restricaoInfantil = restricaoInfantil;
    }

    public void setHistorico(int[] historico) {
        this.historico = historico;
    }

}
