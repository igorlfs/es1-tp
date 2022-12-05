package totalflix.classes;

public class Perfil {
    
    protected String nomePerfil;
    private boolean restricaoInfantil;
    protected int[] historico;

    public Perfil(String nomePerfil, boolean restricaoInfantil) {
        this.nomePerfil = nomePerfil;
        this.restricaoInfantil = restricaoInfantil;
    }

    public void setRestricaoInfantil(boolean restricaoInfantil) {
        this.restricaoInfantil = restricaoInfantil;
    }

    public String getNomePerfil() {
        return nomePerfil;
    }

    public String mudarNomePerfil(String nomePerfil) {
        this.nomePerfil = nomePerfil;
    }
}
