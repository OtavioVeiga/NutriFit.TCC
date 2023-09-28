
package nutrifit.view;

import Entidades.Personal;
import static Firebase.Conexão.initialize;
//import at.favre.lib.crypto.bcrypt.BCrypt;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;

public class LoginView extends javax.swing.JFrame {

   
    public LoginView() {
        initComponents();
        
        initialize();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        email_lb = new javax.swing.JTextField();
        Senha_lb = new javax.swing.JPasswordField();
        Cadastrar_btn = new javax.swing.JButton();
        Sair_btn = new javax.swing.JButton();
        Entrar_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(672, 490));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        jLabel1.setText("Login");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 60, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel2.setText("Senha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 85, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel3.setText("E-mail");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(80, 85, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        email_lb.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 226;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 85, 0, 0);
        getContentPane().add(email_lb, gridBagConstraints);

        Senha_lb.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 226;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 85, 0, 0);
        getContentPane().add(Senha_lb, gridBagConstraints);

        Cadastrar_btn.setBackground(new java.awt.Color(153, 153, 153));
        Cadastrar_btn.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        Cadastrar_btn.setText("Cadastrar");
        Cadastrar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cadastrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastrar_btnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 41;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 20, 80, 0);
        getContentPane().add(Cadastrar_btn, gridBagConstraints);

        Sair_btn.setBackground(new java.awt.Color(153, 153, 153));
        Sair_btn.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        Sair_btn.setText("Sair");
        Sair_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sair_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sair_btnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 68;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 5, 80, 94);
        getContentPane().add(Sair_btn, gridBagConstraints);

        Entrar_btn.setBackground(new java.awt.Color(153, 153, 153));
        Entrar_btn.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        Entrar_btn.setText("Entrar");
        Entrar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Entrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Entrar_btnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 76;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 50, 80, 0);
        getContentPane().add(Entrar_btn, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Cadastrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastrar_btnActionPerformed
        CadastroView telaCadastro = new CadastroView();
        telaCadastro.setVisible(true);
    }//GEN-LAST:event_Cadastrar_btnActionPerformed

    private void Sair_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sair_btnActionPerformed
        this.dispose();
    }//GEN-LAST:event_Sair_btnActionPerformed

    private void Entrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Entrar_btnActionPerformed
        String email = email_lb.getText();
        String senhaDigitada = new String(Senha_lb.getPassword());

        DatabaseReference ref = FirebaseDatabase.getInstance().getReference("Personal");
        ref.orderByChild("email").equalTo(email).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                        Personal personal = snapshot.getValue(Personal.class);
                        if (personal != null) {
                            String senhaCript = personal.getSenha();

                            if (BCrypt.checkpw(senhaDigitada, senhaCript)) {
                              
                                PrincipalView dashboard = new PrincipalView(); 
                                dashboard.setVisible(true);
                                dispose();
                            } else {
                                
                                JOptionPane.showMessageDialog(null, "Senha incorreta. Tente novamente.");
                            }
                        }
                    }
                } else {
                    
                    JOptionPane.showMessageDialog(null, "Usuário não encontrado.");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                
            }
        });
    }//GEN-LAST:event_Entrar_btnActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Dark Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar_btn;
    private javax.swing.JButton Entrar_btn;
    private javax.swing.JButton Sair_btn;
    private javax.swing.JPasswordField Senha_lb;
    private javax.swing.JTextField email_lb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
