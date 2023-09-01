package Entidades;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.util.HashMap;
import java.util.Map;

public class Ficha_Avaliativa {
    private String id;
    private String alunoId;
    private String altura;
    private String peso;
    private String dataAvaliacao;
    private String dataReavaliacao;
    
    public Ficha_Avaliativa(){
        
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

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getDataAvaliacao() {
        return dataAvaliacao;
    }
    
    public void setDataAvaliacao(String dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
}
    
    public void setDataReavaliacao(String dataReavaliacao) {
        this.dataReavaliacao = dataReavaliacao;
}

    public String getDataReavaliacao() {
        return dataReavaliacao;
    }

    public void salvar() {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference fichaRef = database.getReference("fichas_avaliativas").child(id);

    Map<String, Object> fichaValues = new HashMap<>();
    fichaValues.put("id", id);
    fichaValues.put("alunoId", alunoId);
    fichaValues.put("altura", altura);
    fichaValues.put("peso", peso);
    fichaValues.put("data_avaliacao", dataAvaliacao);
    fichaValues.put("data_reavaliacao", dataReavaliacao);

    fichaRef.setValue(fichaValues, (databaseError, databaseReference) -> {
        if (databaseError != null) {
            System.err.println("Erro ao salvar ficha avaliativa: " + databaseError.getMessage());
        } else {
            System.out.println("Ficha avaliativa salva com sucesso!");
        }
    });
}
}