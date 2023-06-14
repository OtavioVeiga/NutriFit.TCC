package nutrifit;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Conexão {

    public static void initialize() {
        try {
            FileInputStream serviceAccount = new FileInputStream("bdd-tcc.json");

            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .build();

            FirebaseApp.initializeApp(options);
            
            System.out.println("Firebase inicializado com sucesso!");
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo de chave não encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo de chave: " + e.getMessage());
        }
    }

}