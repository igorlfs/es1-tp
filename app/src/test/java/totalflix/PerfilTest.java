package totalflix;

import static org.junit.Assert.*;

import org.junit.Test;

import totalflix.classes.Perfil;

public class PerfilTest {
    @Test
    public void testConstructor() {
        Perfil perfil = new Perfil("Família", false);

        assertEquals("Família", perfil.getNomePerfil());
        assertEquals(false, perfil.getRestricaoInfantil());

        perfil.setNomePerfil("Crianças");
        perfil.setRestricaoInfantil(true);

        assertEquals("Crianças", perfil.getNomePerfil());
        assertEquals(true, perfil.getRestricaoInfantil());
    }
}
