package Entidades;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class Personal {
    private String id;
    private String nome;
    private String cpf;
    private int idade;

    public Personal() {
        
    }

    public Personal(String id, String nome, String cpf, int idade) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void salvar() {
    DatabaseReference personalRef = FirebaseDatabase.getInstance()
            .getReference("Personal")
            .child(id);

    Map<String, Object> personalValues = new HashMap<>();
    personalValues.put("id", id);
    personalValues.put("nome", nome);
    personalValues.put("cpf", cpf);
    personalValues.put("idade", idade);

    personalRef.setValue(personalValues, (databaseError, databaseReference) -> {
        if (databaseError != null) {
            System.err.println("Erro ao salvar Personal: " + databaseError.getMessage());
        } else {
            System.out.println("Personal salvo com sucesso!");
        }
    });
}
}