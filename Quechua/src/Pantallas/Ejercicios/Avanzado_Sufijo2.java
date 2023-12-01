
package Pantallas.Ejercicios;

import Pantallas.*;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import Pantallas.Indicaciones.I_Avanzado_Sufijo2;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JOptionPane;



public class Avanzado_Sufijo2 extends javax.swing.JFrame {
    private int SUM1;
    
    public void setDatos(int ACU) {
        this.SUM1 = ACU;
    }
    int puntos = 0;
    int SUM2 = 0;
    
    public Avanzado_Sufijo2() {
        initComponents();
        this.setSize(735, 483);
        this.setLocationRelativeTo(null);
        addDocumentListener(jtxtPreg5,jpbProgreso);
        addDocumentListener(jtxtPreg6,jpbProgreso);
        addDocumentListener(jtxtPreg7,jpbProgreso);
        addDocumentListener(jtxtPreg8,jpbProgreso);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtxtPreg6 = new javax.swing.JTextField();
        jtxtPreg7 = new javax.swing.JTextField();
        jtxtPreg8 = new javax.swing.JTextField();
        jtxtPreg5 = new javax.swing.JTextField();
        jpbProgreso = new javax.swing.JProgressBar();
        jbtnRegresar = new javax.swing.JButton();
        jbtnContinuar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtPreg6.setBackground(new java.awt.Color(255, 255, 255));
        jtxtPreg6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jtxtPreg6.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPreg6.setBorder(null);
        jPanel1.add(jtxtPreg6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 110, 20));

        jtxtPreg7.setBackground(new java.awt.Color(255, 255, 255));
        jtxtPreg7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jtxtPreg7.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPreg7.setBorder(null);
        jPanel1.add(jtxtPreg7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 110, 20));

        jtxtPreg8.setBackground(new java.awt.Color(255, 255, 255));
        jtxtPreg8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jtxtPreg8.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPreg8.setBorder(null);
        jPanel1.add(jtxtPreg8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 120, 20));

        jtxtPreg5.setBackground(new java.awt.Color(255, 255, 255));
        jtxtPreg5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jtxtPreg5.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPreg5.setBorder(null);
        jPanel1.add(jtxtPreg5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 110, 20));

        jpbProgreso.setBackground(new java.awt.Color(175, 175, 175));
        jpbProgreso.setForeground(new java.awt.Color(255, 79, 79));
        jpbProgreso.setBorder(null);
        jPanel1.add(jpbProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 300, 20));

        jbtnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        jbtnRegresar.setFont(new java.awt.Font("Sitka Text", 1, 20)); // NOI18N
        jbtnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        jbtnRegresar.setText("<--   Regresar");
        jbtnRegresar.setBorder(null);
        jbtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 46, 150, 30));

        jbtnContinuar.setBackground(new java.awt.Color(214, 42, 17));
        jbtnContinuar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnContinuar.setText("CONFIRMAR");
        jbtnContinuar.setBorder(null);
        jbtnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnContinuarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 130, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/EjercicioA_S2.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 440));

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

    private void jbtnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnContinuarActionPerformed
        if(jtxtPreg5.getText().toUpperCase().trim().equals("MISIYKUNA")){
            SUM2++;
        }
        if(jtxtPreg6.getText().toUpperCase().trim().equals("ÑAWIYKIKUNA")){
            SUM2++;
        }
        if(jtxtPreg7.getText().toUpperCase().trim().equals("KAWALLUKUNA")){
            SUM2++;
        }
        if(jtxtPreg8.getText().toUpperCase().trim().equals("WASIKUNA")){
            SUM2++;
        }
        puntos = SUM2 + SUM1;
            Menu.user.SumarPuntos(puntos);
            System.out.println(Menu.user.getPuntos());
            Felicidades felicidades= new Felicidades(puntos*5);
            felicidades.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jbtnContinuarActionPerformed

    private void jbtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegresarActionPerformed
        I_Avanzado_Sufijo2 regresar = new I_Avanzado_Sufijo2();
        regresar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnRegresarActionPerformed
    private void addDocumentListener(JTextField textField, JProgressBar jpbProgreso) {
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateProgressBar();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateProgressBar();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // No sirve en este caso
            }

            private void updateProgressBar() {
                int textFieldCount = 4; 
                int emptyFields = 0;
                if (jtxtPreg7.getText().isEmpty()) emptyFields++;
                if (jtxtPreg8.getText().isEmpty()) emptyFields++;
                if (jtxtPreg5.getText().isEmpty()) emptyFields++;
                if (jtxtPreg6.getText().isEmpty()) emptyFields++;

                int progressBarValue = (textFieldCount - emptyFields) * 25; // Aumentar un 25% por cada campo q no esta vacío
                jpbProgreso.setValue(progressBarValue);
            }
        });
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Avanzado_Sufijo2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnContinuar;
    private javax.swing.JButton jbtnRegresar;
    private javax.swing.JProgressBar jpbProgreso;
    private javax.swing.JTextField jtxtPreg5;
    private javax.swing.JTextField jtxtPreg6;
    private javax.swing.JTextField jtxtPreg7;
    private javax.swing.JTextField jtxtPreg8;
    // End of variables declaration//GEN-END:variables
}
