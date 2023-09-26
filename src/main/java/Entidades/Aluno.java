package Entidades;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class Aluno {
    private String id;
    private String nome;
    private String cpf;
    private String telefone;
    private String idade;
    private String altura;
    private String peso;
    private String email;
    private String senha;


    public Aluno() {
        
    }

    public Aluno(String id, String nome, String cpf, String telefone, String idade, String altura, String peso) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.senha = senha;
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
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

    public void salvar() {
    DatabaseReference alunoRef = FirebaseDatabase.getInstance()
            .getReference("alunos")
            .child(id);

    Map<String, Object> alunoValues = new HashMap<>();
    alunoValues.put("nome", nome);
    alunoValues.put("cpf", cpf);
    alunoValues.put("telefone", telefone);
    alunoValues.put("idade", idade);
    alunoValues.put("altura", altura);
    alunoValues.put("peso", peso);
    alunoValues.put("senha", senha);
    alunoValues.put("email",email );

    alunoRef.setValue(alunoValues, (databaseError, databaseReference) -> {
        if (databaseError != null) {
            System.err.println("Erro ao salvar aluno: " + databaseError.getMessage());
        } else {
            System.out.println("Aluno salvo com sucesso!");
        }
    });
}

}