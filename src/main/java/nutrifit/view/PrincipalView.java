package nutrifit.view;


public class PrincipalView extends javax.swing.JFrame {

  
    public PrincipalView() {
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        GerarFciha_NU_btn = new javax.swing.JButton();
        GerarFicha_AV_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CadastrarAluno_btn = new javax.swing.JButton();
        Menu_bar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        FichaAV_menu = new javax.swing.JMenuItem();
        FichaNu_menu = new javax.swing.JMenuItem();
        Sair_menu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        GerarFciha_NU_btn.setBackground(new java.awt.Color(153, 153, 153));
        GerarFciha_NU_btn.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        GerarFciha_NU_btn.setText("Gerar ficha avaliativa");
        GerarFciha_NU_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 82;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 70, 0, 0);
        getContentPane().add(GerarFciha_NU_btn, gridBagConstraints);

        GerarFicha_AV_btn.setBackground(new java.awt.Color(153, 153, 153));
        GerarFicha_AV_btn.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        GerarFicha_AV_btn.setText("Gerar ficha nutricional");
        GerarFicha_AV_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(71, 70, 0, 0);
        getContentPane().add(GerarFicha_AV_btn, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        jLabel1.setText("Personal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 220, 0, 274);
        getContentPane().add(jLabel1, gridBagConstraints);

        CadastrarAluno_btn.setBackground(new java.awt.Color(153, 153, 153));
        CadastrarAluno_btn.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        CadastrarAluno_btn.setText("Cadastrar Aluno");
        CadastrarAluno_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CadastrarAluno_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarAluno_btnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 113;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 70, 97, 0);
        getContentPane().add(CadastrarAluno_btn, gridBagConstraints);

        jMenu1.setText("Editar");
        jMenu1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N

        FichaAV_menu.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        FichaAV_menu.setText("Editar ficha avaliativa");
        jMenu1.add(FichaAV_menu);

        FichaNu_menu.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        FichaNu_menu.setText("Editar ficha nutricional");
        jMenu1.add(FichaNu_menu);

        Sair_menu.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        Sair_menu.setText("Sair");
        Sair_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sair_menuActionPerformed(evt);
            }
        });
        jMenu1.add(Sair_menu);

        Menu_bar.add(jMenu1);

        setJMenuBar(Menu_bar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarAluno_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarAluno_btnActionPerformed
        CadastroAluno telaAluno = new CadastroAluno();
        telaAluno.setVisible(true);
    }//GEN-LAST:event_CadastrarAluno_btnActionPerformed

    private void Sair_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sair_menuActionPerformed
        this.dispose();
    }//GEN-LAST:event_Sair_menuActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarAluno_btn;
    private javax.swing.JMenuItem FichaAV_menu;
    private javax.swing.JMenuItem FichaNu_menu;
    private javax.swing.JButton GerarFciha_NU_btn;
    private javax.swing.JButton GerarFicha_AV_btn;
    private javax.swing.JMenuBar Menu_bar;
    private javax.swing.JMenuItem Sair_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    // End of variables declaration//GEN-END:variables
}
