package totalflix.classes;

public class Serie extends Conteudo {

    private int qtdEps;
    private int qtdTemps;
    
    public Serie(int idConteudo, String titulo, String descricao, String categoria, int anoLancamento, String produtora, int qtdEps, int qtdTemps) {
        super(idConteudo, titulo, descricao, categoria, anoLancamento, produtora);
        this.qtdEps = qtdEps;
        this.qtdTemps = qtdTemps;
    }

    public int getQtdEps() {
        return qtdEps;
    }

    public int getQtdTemps() {
        return qtdTemps;
    }

    public int setQtdEps(int qtdEps) {
        return qtdEps;
    }

    public int setQtdTemps(int qtdTemps) {
        return qtdTemps;
    }
}