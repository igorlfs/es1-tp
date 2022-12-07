package totalflix.classes;

import java.util.ArrayList;

public class Perfil {

	private String nomePerfil;
	private boolean restricaoInfantil;
	private ArrayList<Conteudo> historico;

	public Perfil(String nomePerfil, boolean restricaoInfantil) {
		this.nomePerfil = nomePerfil;
		this.restricaoInfantil = restricaoInfantil;
	}

	public boolean getRestricaoInfantil() {
		return restricaoInfantil;
	}

	public void setRestricaoInfantil(boolean restricaoInfantil) {
		this.restricaoInfantil = restricaoInfantil;
	}

	public String getNomePerfil() {
		return nomePerfil;
	}

	public void setNomePerfil(String nomePerfil) {
		this.nomePerfil = nomePerfil;
	}

	public ArrayList<Conteudo> getHistorico() {
		return historico;
	}

	public void setHistorico(ArrayList<Conteudo> historico) {
		this.historico = historico;
	}
	
	public void addConteudoHistorico(Conteudo conteudo) {
		this.historico.add(conteudo);
	}
}
