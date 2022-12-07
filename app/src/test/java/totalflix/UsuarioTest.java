package totalflix;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import totalflix.classes.MetodoPgto;
import totalflix.classes.Usuario;

public class UsuarioTest {
    @Test
    public void testConstructor() {
        final MetodoPgto metodoPgto = MetodoPgto.BOLETO_BANCARIO;
        final Usuario usuario = new Usuario(1, "123.456.789-10", "Fulano da Silva", "01/01/1990", "fulano@email.com",
                "senha123", "Rua das Flores, 123", "01/01/2020", "01/02/2020", true, metodoPgto);
        assertEquals(1, usuario.getId());
        assertEquals("123.456.789-10", usuario.getCpf());
        assertEquals("Fulano da Silva", usuario.getNome());
        assertEquals("01/01/1990", usuario.getDataNascimento());
        assertEquals("fulano@email.com", usuario.getEmail());
        assertEquals("senha123", usuario.getSenha());
        assertEquals("Rua das Flores, 123", usuario.getEndereco());
        assertEquals("01/01/2020", usuario.getDataAdmissao());
        assertEquals(true, usuario.isAssinaturaAtiva());
        assertEquals("01/02/2020", usuario.getDataAssinatura());
        assertEquals(MetodoPgto.BOLETO_BANCARIO, usuario.getMetodoPgto());
    }

    @Test
    public void testMesGratuito() {
        final MetodoPgto metodoPgto = MetodoPgto.BOLETO_BANCARIO;
        final Usuario usuario = new Usuario(1, "123.456.789-10", "Fulano da Silva", "01/01/1990", "fulano@email.com",
                "senha123", "Rua das Flores, 123", "01/01/2020", "01/02/2020", true, metodoPgto);
        assertEquals(true, usuario.isMesGratuitoAtivo());
        usuario.encerrarGratuitade();
        assertEquals(false, usuario.isMesGratuitoAtivo());
    }

}
