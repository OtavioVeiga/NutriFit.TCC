package nutrifit.view;

import Entidades.Personal;
import static Firebase.Conexão.initialize;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import javax.swing.JOptionPane;


public class CadastroView extends javax.swing.JFrame {

    
    public CadastroView() {
        initComponents();
        
        initialize();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        ConfirmaSenha = new javax.swing.JPasswordField();
        Senha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Nome = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Cancelar_btn = new javax.swing.JToggleButton();
        Cadastrar_btn = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel1.setText("Nome");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 136;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(61, 20, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        ConfirmaSenha.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 226;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 20, 0, 0);
        getContentPane().add(ConfirmaSenha, gridBagConstraints);

        Senha.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 226;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 20, 0, 0);
        getContentPane().add(Senha, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        jLabel2.setText("Cadastro");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 180, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel3.setText("Confirma Senha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 65;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        Nome.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 226;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 20, 0, 0);
        getContentPane().add(Nome, gridBagConstraints);

        cpf.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 226;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 20, 0, 0);
        getContentPane().add(cpf, gridBagConstraints);

        Email.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 226;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 20, 0, 0);
        getContentPane().add(Email, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel4.setText("Senha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 136;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 20, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel5.setText("CPF");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 153;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        getContentPane().add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel6.setText("E-mail");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 135;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        getContentPane().add(jLabel6, gridBagConstraints);

        Cancelar_btn.setBackground(new java.awt.Color(153, 153, 153));
        Cancelar_btn.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        Cancelar_btn.setText("Cancelar");
        Cancelar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 62;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 60, 48, 94);
        getContentPane().add(Cancelar_btn, gridBagConstraints);

        Cadastrar_btn.setBackground(new java.awt.Color(153, 153, 153));
        Cadastrar_btn.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        Cadastrar_btn.setText("Cadastrar");
        Cadastrar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cadastrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastrar_btnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 52;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 40, 48, 0);
        getContentPane().add(Cadastrar_btn, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     private boolean camposSaoValidos() {
    
    if (Nome.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, preencha o campo Nome.", "Campo Nome Vazio", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    
    String cpfText = cpf.getText().trim().replaceAll("[.-]", ""); 
    if (cpfText.isEmpty() || cpfText.length() != 11) {
        JOptionPane.showMessageDialog(this, "Por favor, insira um CPF válido com 11 dígitos.", "CPF Inválido", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    
    String senhaText = new String(Senha.getPassword());
    if (senhaText.length() < 6) {
        JOptionPane.showMessageDialog(this, "A senha deve conter pelo menos 6 caracteres.", "Senha Curta", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    
    String confirmaSenhaText = new String(ConfirmaSenha.getPassword());
    if (!senhaText.equals(confirmaSenhaText)) {
        JOptionPane.showMessageDialog(this, "A senha e a confirmação de senha não coincidem.", "Senhas Diferentes", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    
    return true;
     }
    private void Cadastrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastrar_btnActionPerformed
           
        if (camposSaoValidos()) {
        Personal personal = new Personal();
        personal.setNome(Nome.getText());
        personal.setCpf(cpf.getText());

        DatabaseReference personalRef = FirebaseDatabase.getInstance().getReference("Personal");
        personalRef.push().setValue(personal, new DatabaseReference.CompletionListener() {
            @Override
            public void onComplete(DatabaseError error, DatabaseReference ref) {
                if (error != null) {
                    System.err.println("Erro ao cadastrar Personal: " + error.getMessage());
                } else {
                    System.out.println("Personal cadastrado com sucesso!");
                }
            }
        });
    } 

    }//GEN-LAST:event_Cadastrar_btnActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("FlatLaf Dark".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Cadastrar_btn;
    private javax.swing.JToggleButton Cancelar_btn;
    private javax.swing.JPasswordField ConfirmaSenha;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Nome;
    private javax.swing.JPasswordField Senha;
    private javax.swing.JTextField cpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

}
