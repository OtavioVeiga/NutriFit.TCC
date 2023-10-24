package nutrifit.view;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.swing.JOptionPane;




public class Ficha_avaliativa extends javax.swing.JFrame {
    
     DatabaseReference databaseReference;
        Map<String, List<String>> treinos;

    public Ficha_avaliativa() {
        initComponents();
        
        databaseReference = FirebaseDatabase.getInstance().getReference("Exercicio");

        // Inicialize os treinos e carregue os exercícios apropriados
        treinos = new HashMap<>();
        treinos.put("Treino A", new ArrayList<>());
        treinos.put("Treino B", new ArrayList<>());
        treinos.put("Treino C", new ArrayList<>());

        carregarExerciciosParaTreinos();

        geraFicha.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                String fichaTreinoA = gerarFichaTreino("Treino A");
                String fichaTreinoB = gerarFichaTreino("Treino B");
                String fichaTreinoC = gerarFichaTreino("Treino C");

                
                exibirFichas(fichaTreinoA, fichaTreinoB, fichaTreinoC);
            }
        });

        cancelaFicha.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }

     private void carregarExerciciosParaTreinos() {
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                
                for (DataSnapshot exercicioSnapshot : dataSnapshot.getChildren()) {
                    String musculo = exercicioSnapshot.child("musculo").getValue(String.class);
                    String nomeExercicio = exercicioSnapshot.child("nome").getValue(String.class);

                    if (musculo.equals("Ombro")) {
                        treinos.get("Treino A").add(nomeExercicio);
                    } else if (musculo.equals("Peito")) {
                        treinos.get("Treino A").add(nomeExercicio);
                    } else if (musculo.equals("Costas") || musculo.equals("Bíceps") || musculo.equals("Tríceps")) {
                        treinos.get("Treino B").add(nomeExercicio);
                    } else if (musculo.equals("Perna")) {
                        treinos.get("Treino C").add(nomeExercicio);
                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {
                System.out.println("Erro ao carregar exercícios: " + error.getMessage());
            }
        });
    }
     
     private String gerarFichaTreino(String nomeTreino) {
        List<String> exercicios = treinos.get(nomeTreino);

        if (exercicios.isEmpty()) {
            return "Sem exercícios disponíveis para " + nomeTreino;
        }

        StringBuilder ficha = new StringBuilder();
        ficha.append("").append(nomeTreino).append("\n\n");

        Random random = new Random();

        for (int i = 1; i <= 6; i++) {
            int indiceExercicio = random.nextInt(exercicios.size());
            String exercicio = exercicios.get(indiceExercicio);
            ficha.append("Exercício ").append(i).append(": ").append(exercicio).append("\n");
            exercicios.remove(indiceExercicio);
        }

        return ficha.toString();
    }

    private void exibirFichas(String fichaTreinoA, String fichaTreinoB, String fichaTreinoC) {
        JOptionPane.showMessageDialog(null, fichaTreinoA + "\n\n" + fichaTreinoB + "\n\n" + fichaTreinoC);
    }


     
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ficha_avaliativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ficha_avaliativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ficha_avaliativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ficha_avaliativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ficha_avaliativa().setVisible(true);
            }
        });
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        sim = new javax.swing.JRadioButton();
        nao = new javax.swing.JRadioButton();
        nomeFicha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        idadeFicha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        frequenciaTreino = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        objTreino = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cancelaFicha = new javax.swing.JButton();
        geraFicha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        jLabel1.setText("Ficha Avaliativa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        sim.setText("Sim");
        sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 20, 0, 0);
        getContentPane().add(sim, gridBagConstraints);

        nao.setText("Não");
        nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 20, 0, 0);
        getContentPane().add(nao, gridBagConstraints);

        nomeFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFichaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 176;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 20, 0, 0);
        getContentPane().add(nomeFicha, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel2.setText("Nome");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(61, 20, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        idadeFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeFichaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 176;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 20, 0, 0);
        getContentPane().add(idadeFicha, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel3.setText("Idade");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 20, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        frequenciaTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frequenciaTreinoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 176;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 20, 0, 0);
        getContentPane().add(frequenciaTreino, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel4.setText("Frequência de Treino (dias/semana)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 20, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

        objTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                objTreinoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 176;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 20, 0, 0);
        getContentPane().add(objTreino, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel5.setText("Objetivo de Treino");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 20, 0, 0);
        getContentPane().add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel6.setText("Condição Médica Pré-existente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 20, 0, 0);
        getContentPane().add(jLabel6, gridBagConstraints);

        cancelaFicha.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        cancelaFicha.setText("Cancelar");
        cancelaFicha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelaFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelaFichaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 69;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 40, 35, 52);
        getContentPane().add(cancelaFicha, gridBagConstraints);

        geraFicha.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        geraFicha.setText("Gerar a ficha");
        geraFicha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geraFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geraFichaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 20, 35, 0);
        getContentPane().add(geraFicha, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_simActionPerformed

    private void naoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_naoActionPerformed

    private void objTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_objTreinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_objTreinoActionPerformed

    private void frequenciaTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frequenciaTreinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frequenciaTreinoActionPerformed

    private void idadeFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeFichaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadeFichaActionPerformed

    private void nomeFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFichaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFichaActionPerformed

    private void geraFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geraFichaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_geraFichaActionPerformed

    private void cancelaFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelaFichaActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelaFichaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelaFicha;
    private javax.swing.JTextField frequenciaTreino;
    private javax.swing.JButton geraFicha;
    private javax.swing.JTextField idadeFicha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton nao;
    private javax.swing.JTextField nomeFicha;
    private javax.swing.JTextField objTreino;
    private javax.swing.JRadioButton sim;
    // End of variables declaration//GEN-END:variables
}
