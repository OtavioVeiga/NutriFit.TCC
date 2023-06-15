package Tests;

import Entidades.Personal;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Teste_Personal {

    private Personal personal;

    @BeforeEach
    public void setUp() {
        personal = new Personal();
        personal.setId("1");
        personal.setNome("Carlos");
        personal.setCpf("987654321");
        personal.setIdade(30);
    }

    @AfterEach
    public void tearDown() {
        
        personal = null;
    }

    @Test
    public void testSalvar_ValidPersonal_Success() {
        // Verificar se a chamada do método salvar não lança exceção
        assertDoesNotThrow(() -> personal.salvar());
    }

    @Test
    public void testSettersAndGetters_CorrectValues() {
        assertEquals("1", personal.getId(), "O ID deve ser igual a '1'");
        assertEquals("Carlos", personal.getNome(), "O nome deve ser igual a 'Carlos'");
        assertEquals("987654321", personal.getCpf(), "O CPF deve ser igual a '987654321'");
        assertEquals(30, personal.getIdade(), "A idade deve ser igual a '30'");
    }
}