package Entidades;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class Ficha_Regime {
    private String id;
    private String alunoId;
    private String peso;
    private String idade;

    public Ficha_Regime() {
        
    }

    public Ficha_Regime(String id, String alunoId, String peso, String idade) {
        this.id = id;
        this.alunoId = alunoId;
        this.peso = peso;
        this.idade = idade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(String alunoId) {
        this.alunoId = alunoId;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public void salvar() {
    DatabaseReference fichaRef = FirebaseDatabase.getInstance()
            .getReference("fichas_regime")
            .child(id);

    Map<String, Object> fichaValues = new HashMap<>();
    fichaValues.put("id", id);
    fichaValues.put("alunoId", alunoId);
    fichaValues.put("peso", peso);
    fichaValues.put("idade", idade);

    fichaRef.setValue(fichaValues, (databaseError, databaseReference) -> {
        if (databaseError != null) {
            System.err.println("Erro ao salvar ficha de regime: " + databaseError.getMessage());
        } else {
            System.out.println("Ficha de regime salva com sucesso!");
        }
    });
}

}