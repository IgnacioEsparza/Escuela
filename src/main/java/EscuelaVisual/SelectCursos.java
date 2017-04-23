/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaVisual;

import EscuelaPackage.Curso;
import Generar.GenerarCursos;

/**
 *
 * @author Ignacio
 */
public class SelectCursos extends javax.swing.JFrame {

    InfoCurso ic = new InfoCurso();
    GenerarCursos gc = new GenerarCursos();
    Curso[] CA = gc.CursosA();
    Curso[] CB = gc.CursosB();
    
    public SelectCursos() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void seleccionA(){
        if (SeleccionarCursoA.getSelectedIndex() == 1) {
            ic.llenadoInfoCurso(CA[0]);
            ic.setVisible(true);
            dispose();
        }
        if (SeleccionarCursoA.getSelectedIndex() == 2) {
            ic.llenadoInfoCurso(CA[1]);
            ic.setVisible(true);
            dispose();
        }
        if (SeleccionarCursoA.getSelectedIndex() == 3) {
            ic.llenadoInfoCurso(CA[2]);
            ic.setVisible(true);
            dispose();
        }
        if (SeleccionarCursoA.getSelectedIndex() == 4) {
            ic.llenadoInfoCurso(CA[3]);
            ic.setVisible(true);
            dispose();
        }
        if (SeleccionarCursoA.getSelectedIndex() == 5) {
            ic.llenadoInfoCurso(CA[4]);
            ic.setVisible(true);
            dispose();
        }
        if (SeleccionarCursoA.getSelectedIndex() == 6) {
            ic.llenadoInfoCurso(CA[5]);
            ic.setVisible(true);
            dispose();
        }
        if (SeleccionarCursoA.getSelectedIndex() == 7) {
            ic.llenadoInfoCurso(CA[6]);
            ic.setVisible(true);
            dispose();
        }
        if (SeleccionarCursoA.getSelectedIndex() == 8) {
            ic.llenadoInfoCurso(CA[7]);
            ic.setVisible(true);
            dispose();
        }
    }
    public void seleccionB(){
        if (SeleccionarCursoB.getSelectedIndex() == 1) {
            ic.llenadoInfoCurso(CA[0]);
            ic.setVisible(true);
            dispose();
        }
        if (SeleccionarCursoB.getSelectedIndex() == 2) {
            ic.llenadoInfoCurso(CB[1]);
            ic.setVisible(true);
            dispose();
        }
        if (SeleccionarCursoB.getSelectedIndex() == 3) {
            ic.llenadoInfoCurso(CB[2]);
            ic.setVisible(true);
            dispose();
        }
        if (SeleccionarCursoB.getSelectedIndex() == 4) {
            ic.llenadoInfoCurso(CB[3]);
            ic.setVisible(true);
            dispose();
        }
        if (SeleccionarCursoB.getSelectedIndex() == 5) {
            ic.llenadoInfoCurso(CB[4]);
            ic.setVisible(true);
            dispose();
        }
        if (SeleccionarCursoB.getSelectedIndex() == 6) {
            ic.llenadoInfoCurso(CB[5]);
            ic.setVisible(true);
            dispose();
        }
        if (SeleccionarCursoB.getSelectedIndex() == 7) {
            ic.llenadoInfoCurso(CB[6]);
            ic.setVisible(true);
            dispose();
        }
        if (SeleccionarCursoB.getSelectedIndex() == 8) {
            ic.llenadoInfoCurso(CB[7]);
            ic.setVisible(true);
            dispose();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SeleccionarCursoA = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SeleccionarCursoB = new javax.swing.JComboBox<>();
        VolverSelectCurso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SeleccionarCursoA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selec. Curso", "1ero", "2do", "3ro", "4to", "5to", "6to", "7mo", "8vo" }));
        SeleccionarCursoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarCursoAActionPerformed(evt);
            }
        });

        jLabel1.setText("Cursos A");

        jLabel2.setText("Cursos B");

        SeleccionarCursoB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selec. Curso", "1ero", "2do", "3ro", "4to", "5to", "6to", "7mo", "8vo" }));
        SeleccionarCursoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarCursoBActionPerformed(evt);
            }
        });

        VolverSelectCurso.setText("Volver");
        VolverSelectCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverSelectCursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(SeleccionarCursoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(SeleccionarCursoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))))
            .addGroup(layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(VolverSelectCurso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SeleccionarCursoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SeleccionarCursoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                .addComponent(VolverSelectCurso)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SeleccionarCursoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarCursoAActionPerformed
        seleccionA();
    }//GEN-LAST:event_SeleccionarCursoAActionPerformed

    private void SeleccionarCursoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarCursoBActionPerformed
        seleccionB();
    }//GEN-LAST:event_SeleccionarCursoBActionPerformed

    private void VolverSelectCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverSelectCursoActionPerformed
        SelectProfesor sp = new SelectProfesor();
        sp.setVisible(true);
        dispose();
    }//GEN-LAST:event_VolverSelectCursoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(SelectCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectCursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> SeleccionarCursoA;
    private javax.swing.JComboBox<String> SeleccionarCursoB;
    private javax.swing.JButton VolverSelectCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
