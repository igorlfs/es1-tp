package totalflix.classes;

import java.time.LocalDate;

public class Usuario extends Pessoa {

    private boolean assinaturaAtiva;
    private LocalDate dataAssinatura;

    public Usuario(int id, String cpf, String nome, String dataNascimento, String email, String senha, String endereco,
            String dataCriacao) {
        super(id, cpf, nome, dataNascimento, email, senha, endereco, dataCriacao);
    }

    public void desativarAssinatura() {
        this.assinaturaAtiva = false;
    }

    public void ativarAssinatura() {
        this.assinaturaAtiva = true;
    }

    public boolean isAssinaturaAtiva() {
        return assinaturaAtiva;
    }

    public LocalDate getDataAssinatura() {
        return dataAssinatura;
    }

    public void setAssinaturaAtiva(boolean assinaturaAtiva) {
        this.assinaturaAtiva = assinaturaAtiva;
    }

    public void setDataAssinatura(LocalDate dataAssinatura) {
        this.dataAssinatura = dataAssinatura;
    }

}
