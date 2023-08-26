import Entidades.Personal;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Teste_Personal {

    private Personal personal;

    @BeforeEach
    public void setUp() {
        personal = new Personal();
        personal.setId("1");
        personal.setNome("Alice");
        personal.setCpf("12345678900");
        personal.setIdade(28);
    }

    @Test
    public void testSettersAndGetters_CorrectValues() {
        assertEquals("1", personal.getId());
        assertEquals("Alice", personal.getNome());
        assertEquals("12345678900", personal.getCpf());
        assertEquals(28, personal.getIdade());
    }

    @Test
    public void testSalvar_ValidPersonal_Success() {
        assertDoesNotThrow(() -> personal.salvar());
    }
}