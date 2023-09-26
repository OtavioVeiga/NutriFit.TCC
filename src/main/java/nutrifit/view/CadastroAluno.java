package nutrifit.view;

import javax.swing.JOptionPane;
import Entidades.Aluno;
import static Firebase.Conexão.initialize;
import at.favre.lib.crypto.bcrypt.BCrypt;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;


public class CadastroAluno extends javax.swing.JFrame {

    
    public CadastroAluno() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ConfirmeSenha_Aluno = new javax.swing.JPasswordField();
        Senha_Aluno = new javax.swing.JPasswordField();
        Nome_Aluno = new javax.swing.JTextField();
        Email_Aluno = new javax.swing.JTextField();
        Cpf_Aluno = new javax.swing.JTextField();
        Peso = new javax.swing.JTextField();
        Altura = new javax.swing.JTextField();
        Telefone = new javax.swing.JTextField();
        Idade = new javax.swing.JTextField();
        Cancelar_Aluno = new javax.swing.JToggleButton();
        Cadastro_AlunoBT = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        jLabel2.setText("Cadastrar Aluno");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 5, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel3.setText("Nome");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 10, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel4.setText("E-mail");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel5.setText("CPF");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        getContentPane().add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel6.setText("Senha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        getContentPane().add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel7.setText("Confirma Senha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        getContentPane().add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel8.setText("Telefone");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 100, 0, 0);
        getContentPane().add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel9.setText("Altura");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 100, 0, 0);
        getContentPane().add(jLabel9, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel10.setText("Peso");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 100, 0, 0);
        getContentPane().add(jLabel10, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel11.setText("Idade");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 100, 0, 0);
        getContentPane().add(jLabel11, gridBagConstraints);

        ConfirmeSenha_Aluno.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 156;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        getContentPane().add(ConfirmeSenha_Aluno, gridBagConstraints);

        Senha_Aluno.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 156;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        getContentPane().add(Senha_Aluno, gridBagConstraints);

        Nome_Aluno.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 156;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        getContentPane().add(Nome_Aluno, gridBagConstraints);

        Email_Aluno.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 156;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        getContentPane().add(Email_Aluno, gridBagConstraints);

        Cpf_Aluno.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 156;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        getContentPane().add(Cpf_Aluno, gridBagConstraints);

        Peso.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 166;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 100, 0, 26);
        getContentPane().add(Peso, gridBagConstraints);

        Altura.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 166;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 100, 0, 26);
        getContentPane().add(Altura, gridBagConstraints);

        Telefone.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 166;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 100, 0, 26);
        getContentPane().add(Telefone, gridBagConstraints);

        Idade.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 166;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 100, 0, 26);
        getContentPane().add(Idade, gridBagConstraints);

        Cancelar_Aluno.setBackground(new java.awt.Color(153, 153, 153));
        Cancelar_Aluno.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        Cancelar_Aluno.setText("Cancelar");
        Cancelar_Aluno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancelar_Aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancelar_AlunoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 72;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 130, 36, 0);
        getContentPane().add(Cancelar_Aluno, gridBagConstraints);

        Cadastro_AlunoBT.setBackground(new java.awt.Color(153, 153, 153));
        Cadastro_AlunoBT.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        Cadastro_AlunoBT.setText("Cadastrar Aluno");
        Cadastro_AlunoBT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cadastro_AlunoBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastro_AlunoBTActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 20, 36, 0);
        getContentPane().add(Cadastro_AlunoBT, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cadastro_AlunoBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastro_AlunoBTActionPerformed
        if (camposValidos()) {
            Aluno aluno = new Aluno();
            aluno.setAltura(Altura.getText());
            aluno.setCpf(Cpf_Aluno.getText());
            aluno.setEmail(Email_Aluno.getText());
            aluno.setIdade(Idade.getText());
            aluno.setNome(Nome_Aluno.getText());
            aluno.setPeso(Peso.getText());

            String senhaCripto = BCrypt.withDefaults().hashToString(12, Senha_Aluno.getPassword());
            aluno.setSenha(senhaCripto);

            DatabaseReference alunoRef = FirebaseDatabase.getInstance().getReference("Aluno");
            alunoRef.push().setValue(aluno, new DatabaseReference.CompletionListener() {
                @Override
                public void onComplete(DatabaseError error, DatabaseReference ref) {
                    if (error != null) {
                        System.err.println("Erro ao cadastrar o Aluno: " + error.getMessage());
                    } else {
                        System.out.println("Aluno cadastrado com sucesso!");
                    }
                    
                    Nome_Aluno.setText("");
                    Cpf_Aluno.setText("");
                    Email_Aluno.setText("");
                    Senha_Aluno.setText("");
                    ConfirmeSenha_Aluno.setText("");
                    Telefone.setText("");
                    Altura.setText("");
                    Peso.setText("");
                    Idade.setText("");

                    JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!", "Cadastro Concluído", JOptionPane.INFORMATION_MESSAGE);
                }
            });
        }
    }//GEN-LAST:event_Cadastro_AlunoBTActionPerformed

    private void Cancelar_AlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancelar_AlunoActionPerformed
        this.dispose();
    }//GEN-LAST:event_Cancelar_AlunoActionPerformed
    
    
    private boolean camposValidos() {

        if (Nome_Aluno.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o campo Nome.", "Campo Nome Vazio", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        String cpfText = Cpf_Aluno.getText().trim().replaceAll("[.-]", "");
        if (cpfText.isEmpty() || cpfText.length() != 11) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um CPF válido com 11 dígitos.", "CPF Inválido", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        String senhaText = new String(Senha_Aluno.getPassword());
        if (senhaText.length() < 6) {
            JOptionPane.showMessageDialog(this, "A senha deve conter pelo menos 6 caracteres.", "Senha Curta", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        String confirmaSenhaText = new String(ConfirmeSenha_Aluno.getPassword());
        if (!senhaText.equals(confirmaSenhaText)) {
            JOptionPane.showMessageDialog(this, "A senha e a confirmação de senha não coincidem.", "Senhas Diferentes", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;  
    }
    
    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Altura;
    private javax.swing.JToggleButton Cadastro_AlunoBT;
    private javax.swing.JToggleButton Cancelar_Aluno;
    private javax.swing.JPasswordField ConfirmeSenha_Aluno;
    private javax.swing.JTextField Cpf_Aluno;
    private javax.swing.JTextField Email_Aluno;
    private javax.swing.JTextField Idade;
    private javax.swing.JTextField Nome_Aluno;
    private javax.swing.JTextField Peso;
    private javax.swing.JPasswordField Senha_Aluno;
    private javax.swing.JTextField Telefone;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
