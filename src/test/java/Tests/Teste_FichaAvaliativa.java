package Tests;

import Entidades.Ficha_Avaliativa;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Teste_FichaAvaliativa {
    

    private Ficha_Avaliativa ficha;


    @BeforeEach
    public void setUp() {
        ficha = new Ficha_Avaliativa();
        ficha.setId("1");
        ficha.setAlunoId("123");
        ficha.setAltura("1.70");
        ficha.setPeso("65.0");
        ficha.setDataAvaliacao("2023-06-01");
    }

    @AfterEach
    public void tearDown() {
        // Limpar os dados após cada teste
        ficha = null;
    }

    @Test
    public void testSalvar_ValidFichaAvaliativa_Success() {
        // Verificar se a chamada do método salvar não lança exceção
        assertDoesNotThrow(() -> ficha.salvar());
    }

    @Test
    public void testSettersAndGetters_CorrectValues() {
        assertEquals("1", ficha.getId(), "O ID deve ser igual a '1'");
        assertEquals("123", ficha.getAlunoId(), "O ID do aluno deve ser igual a '123'");
        assertEquals("1.70", ficha.getAltura(), "A altura deve ser igual a '1.70'");
        assertEquals("65.0", ficha.getPeso(), "O peso deve ser igual a '65.0'");
        assertEquals("2023-06-01", ficha.getDataAvaliacao(), "A data de avaliação deve ser igual a '2023-06-01'");
    }
}