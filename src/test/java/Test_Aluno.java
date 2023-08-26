import Entidades.Aluno;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Test_Aluno {

    private Aluno aluno;

    @BeforeEach
    public void setUp() {
        aluno = new Aluno();
        aluno.setId("1");
        aluno.setNome("João");
        aluno.setCpf("12345678900");
        aluno.setTelefone("987654321");
        aluno.setIdade(25);
        aluno.setAltura("1.75");
        aluno.setPeso("70.5");
    }

    @Test
    public void testSettersAndGetters_CorrectValues() {
        assertEquals("1", aluno.getId());
        assertEquals("João", aluno.getNome());
        assertEquals("12345678900", aluno.getCpf());
        assertEquals("987654321", aluno.getTelefone());
        assertEquals(25, aluno.getIdade());
        assertEquals("1.75", aluno.getAltura());
        assertEquals("70.5", aluno.getPeso());
    }

    @Test
    public void testSalvar_ValidAluno_Success() {
        assertDoesNotThrow(() -> aluno.salvar());
    }
}
