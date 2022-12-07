package totalflix;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import totalflix.classes.Administrador;

public class AdministradorTest {

    @Test
    public void testConstructor() {
        final Administrador admin = new Administrador(1, "123.456.789-10", "João da Silva", "01/01/1970",
                "joao@silva.com",
                "senha123", "Rua das Flores, 123", "01/01/2010", 3, "Gerente de TI");

        assertEquals(1, admin.getId());
        assertEquals("123.456.789-10", admin.getCpf());
        assertEquals("João da Silva", admin.getNome());
        assertEquals("01/01/1970", admin.getDataNascimento());
        assertEquals("joao@silva.com", admin.getEmail());
        assertEquals("senha123", admin.getSenha());
        assertEquals("Rua das Flores, 123", admin.getEndereco());
        assertEquals("01/01/2010", admin.getDataAdmissao());
        assertEquals(3, admin.getNivelAcesso());
        assertEquals("Gerente de TI", admin.getCargo());
    }
}
