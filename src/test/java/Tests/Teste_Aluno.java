package Tests;

import Entidades.Aluno;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Teste_Aluno {

    private Aluno aluno;

    @BeforeEach
    public void setUp() {
        aluno = new Aluno();
        aluno.setId("1");
        aluno.setNome("João");
        aluno.setCpf("123456789");
        aluno.setTelefone("987654321");
        aluno.setIdade(25);
        aluno.setAltura("1.80");
        aluno.setPeso("75.0");
    }

    @AfterEach
    public void tearDown() {
        // Limpar os dados após cada teste
        aluno = null;
    }

    @Test
    public void testSalvar_ValidAluno_Success() {
        // Verificar se a chamada do método salvar não lança exceção
        assertDoesNotThrow(() -> aluno.salvar());
    }

    @Test
    public void testSettersAndGetters_CorrectValues() {
        assertEquals("1", aluno.getId(), "O ID deve ser igual a '1'");
        assertEquals("João", aluno.getNome(), "O nome deve ser igual a 'João'");
        assertEquals("123456789", aluno.getCpf(), "O CPF deve ser igual a '123456789'");
        assertEquals("987654321", aluno.getTelefone(), "O telefone deve ser igual a '987654321'");
        assertEquals(25, aluno.getIdade(), "A idade deve ser igual a '25'");
        assertEquals("1.80", aluno.getAltura(), "A altura deve ser igual a '1.80'");
        assertEquals("75.0", aluno.getPeso(), "O peso deve ser igual a '75.0'");
    }
}