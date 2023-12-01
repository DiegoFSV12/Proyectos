
package Pantallas;
import Modelo.Usuario;
import Pantallas.Ejercicios.Examen;

public class Menu extends javax.swing.JFrame {
    public static Usuario user;
    public Menu(Usuario usuario) {
        initComponents();
        user = usuario;
        this.setSize(1180, 690);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblSaludo2 = new javax.swing.JLabel();
        lblSaludo3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(122, 113, 113));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(19, 19, 19));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("¡Un placer volver a verte!");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 300, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/kuzco4.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 233, 198));

        lblSaludo2.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        lblSaludo2.setForeground(new java.awt.Color(19, 19, 19));
        lblSaludo2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSaludo2.setText("Hola, ¿Te esta gustando nuestros ejercicios?");
        jPanel1.add(lblSaludo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 390, -1));

        lblSaludo3.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        lblSaludo3.setForeground(new java.awt.Color(19, 19, 19));
        lblSaludo3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSaludo3.setText("Sigue practicando y dominaras esta lengua.");
        jPanel1.add(lblSaludo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 370, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cerrar48.png"))); // NOI18N
        jButton4.setText("Cerrar Sesión");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton4.setIconTextGap(10);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cerrar64.png"))); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 200, 95));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 690));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(252, 59, 30));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Practicar");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 550, 130));

        jButton3.setBackground(new java.awt.Color(252, 59, 30));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Conquistas");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 550, 130));

        jButton5.setBackground(new java.awt.Color(252, 59, 30));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Tabla de Puntuaciones");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 550, 130));

        jButton1.setBackground(new java.awt.Color(252, 59, 30));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Examen");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 550, 130));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 750, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        Logeo login = new Logeo();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Examen exam = new Examen();
        exam.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SeleccionarNivel level = new SeleccionarNivel();
        level.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        TablaPuntuaciones tabla = new TablaPuntuaciones();
        tabla.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Conquistas tabla = new Conquistas();
        tabla.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lblSaludo2;
    public javax.swing.JLabel lblSaludo3;
    // End of variables declaration//GEN-END:variables
}
