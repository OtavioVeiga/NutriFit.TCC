

import Entidades.Ficha_Regime;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Teste_FichaRegime {

    private Ficha_Regime ficha;

    @BeforeEach
    public void setUp() {
        ficha = new Ficha_Regime();
        ficha.setId("1");
        ficha.setAlunoId("123");
        ficha.setPeso("65.0");
        ficha.setIdade("25");
    }

    @AfterEach
    public void tearDown() {
        // Limpar os dados após cada teste
        ficha = null;
    }

    @Test
    public void testSalvar_ValidFichaRegime_Success() {
        // Verificar se a chamada do método salvar não lança exceção
        assertDoesNotThrow(() -> ficha.salvar());
    }

    @Test
    public void testSettersAndGetters_CorrectValues() {
        assertEquals("1", ficha.getId(), "O ID deve ser igual a '1'");
        assertEquals("123", ficha.getAlunoId(), "O ID do aluno deve ser igual a '123'");
        assertEquals("65.0", ficha.getPeso(), "O peso deve ser igual a '65.0'");
        assertEquals("25", ficha.getIdade(), "A idade deve ser igual a '25'");
    }
}