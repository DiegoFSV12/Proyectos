/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pantallas;

import Pantallas.Indicaciones.*;

/**
 *
 * @author USER
 */
public class SeleccionarIntermedio extends javax.swing.JFrame {

    /**
     * Creates new form SeleccionarPrincipiante
     */
    public SeleccionarIntermedio() {
        initComponents();
        jbtnConjugacion.setText("<html><p>Conjugación :</p><p>Tiempo Presente</p></html>");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbtnConjugacion = new javax.swing.JButton();
        jbtnDeseo = new javax.swing.JButton();
        jbtnOraciones = new javax.swing.JButton();
        jbtnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(236, 236, 236));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/read1.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 100, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/oraciones.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 80, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/deseo1.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 102));

        jbtnConjugacion.setBackground(new java.awt.Color(252, 59, 30));
        jbtnConjugacion.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnConjugacion.setForeground(new java.awt.Color(255, 255, 255));
        jbtnConjugacion.setText("Conjugación: Tiempo Presente");
        jbtnConjugacion.setBorder(null);
        jbtnConjugacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConjugacionActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnConjugacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 286, 75));

        jbtnDeseo.setBackground(new java.awt.Color(252, 59, 30));
        jbtnDeseo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDeseo.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDeseo.setText("Verbos de deseo");
        jbtnDeseo.setBorder(null);
        jbtnDeseo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeseoActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnDeseo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 89, 286, 75));

        jbtnOraciones.setBackground(new java.awt.Color(252, 59, 30));
        jbtnOraciones.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnOraciones.setForeground(new java.awt.Color(255, 255, 255));
        jbtnOraciones.setText("Formar Oraciones");
        jbtnOraciones.setBorder(null);
        jbtnOraciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOracionesActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnOraciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 89, 286, 75));

        jbtnRegresar.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jbtnRegresar.setText("<-- REGRESAR");
        jbtnRegresar.setBorder(null);
        jbtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegresarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 140, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/kuzco4Peque.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(19, 19, 19));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Seleccionar Leccion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(99, 99, 99))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnConjugacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConjugacionActionPerformed
    I_Intermedio_Tiempo ejercicio = new I_Intermedio_Tiempo();
    ejercicio.setVisible(true);
    this.dispose();    
    }//GEN-LAST:event_jbtnConjugacionActionPerformed

    private void jbtnDeseoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeseoActionPerformed
    I_Intermedio_Deseo ejercicio = new I_Intermedio_Deseo();
    ejercicio.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jbtnDeseoActionPerformed

    private void jbtnOracionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnOracionesActionPerformed
    I_Intermedio_Oraciones ejercicio = new I_Intermedio_Oraciones();
    ejercicio.setVisible(true);
    this.dispose();    
    }//GEN-LAST:event_jbtnOracionesActionPerformed

    private void jbtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegresarActionPerformed
        SeleccionarNivel menu = new SeleccionarNivel();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(SeleccionarIntermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionarIntermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionarIntermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionarIntermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionarIntermedio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnConjugacion;
    private javax.swing.JButton jbtnDeseo;
    private javax.swing.JButton jbtnOraciones;
    private javax.swing.JButton jbtnRegresar;
    // End of variables declaration//GEN-END:variables
}
