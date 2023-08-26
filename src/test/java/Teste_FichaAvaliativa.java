import Entidades.Ficha_Avaliativa;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Teste_FichaAvaliativa {

    private Ficha_Avaliativa ficha;

    @BeforeEach
    public void setUp() {
        ficha = new Ficha_Avaliativa();
        ficha.setId("1");
        ficha.setAlunoId("123");
        ficha.setAltura("1.75");
        ficha.setPeso("70.5");
        ficha.setDataAvaliacao("2023-06-03");
        ficha.setDataReavaliacao("2023-07-03");
    }

    @Test
    public void testSettersAndGetters_CorrectValues() {
        assertEquals("1", ficha.getId());
        assertEquals("123", ficha.getAlunoId());
        assertEquals("1.75", ficha.getAltura());
        assertEquals("70.5", ficha.getPeso());
        assertEquals("2023-06-03", ficha.getDataAvaliacao());
        assertEquals("2023-07-03", ficha.getDataReavaliacao());
    }

    @Test
    public void testSalvar_ValidFichaAvaliativa_Success() {
        assertDoesNotThrow(() -> ficha.salvar());
    }
}