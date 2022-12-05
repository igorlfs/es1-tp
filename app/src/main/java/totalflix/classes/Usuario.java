package totalflix.classes;

public class Usuario extends Pessoa {
    
    private boolean assinaturaAtiva;
    private LocalDate dataAssinatura;
    
    public Usuario(int id, String cpf, String nome, String dataNascimento, String email, String senha, String endereco, String dataCriacao) {
        super(id, cpf, nome, dataNascimento, email, senha, endereco, dataCriacao);
    }
    
    public void desativarAssinatura() {
        this.assinaturaAtiva = false;
    }

    public void ativarAssinatura() {
        this.assinaturaAtiva = true;
    }

    public LocalDate getDataAssinatura() {
        return dataAssinatura;
    }

    public void setDataAssinatura(LocalDate dataAssinatura) {
        this.dataAssinatura = dataAssinatura;
    }

    public boolean isAssinaturaAtiva() {
        return assinaturaAtiva;
    }
}
