
package Ventanas;

import ConexionBD.Conexion;
import java.awt.Image;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Logeo extends javax.swing.JFrame {
    public static String user = "";
    String pass = "";
    public Logeo() {
        initComponents();
        setSize(550, 400);
        setResizable(false);
        setTitle("Inicio de Sesión");
        this.setLocationRelativeTo(null);
        
        ImageIcon wallpaper = new ImageIcon("src/Icons/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jlblWallpaper.getWidth(), jlblWallpaper.getHeight(), Image.SCALE_DEFAULT));
        jlblWallpaper.setIcon(icono);
        this.repaint();
        
        ImageIcon logo = new ImageIcon("src/Icons/DS.png");
        Icon iconoLogo = new ImageIcon(logo.getImage().getScaledInstance(jlblLogo.getWidth(), jlblLogo.getHeight(), Image.SCALE_DEFAULT));
        jlblLogo.setIcon(iconoLogo);
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtUsuario = new javax.swing.JTextField();
        jpswContra = new javax.swing.JPasswordField();
        jbtnAcceder = new javax.swing.JButton();
        jlblLogo = new javax.swing.JLabel();
        jlblWallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtUsuario.setBackground(new java.awt.Color(153, 153, 255));
        jtxtUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtxtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jtxtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 210, -1));

        jpswContra.setBackground(new java.awt.Color(153, 153, 255));
        jpswContra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jpswContra.setForeground(new java.awt.Color(255, 255, 255));
        jpswContra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpswContra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jpswContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 210, -1));

        jbtnAcceder.setBackground(new java.awt.Color(153, 153, 255));
        jbtnAcceder.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtnAcceder.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAcceder.setText("Acceder");
        jbtnAcceder.setBorder(null);
        jbtnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAccederActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 210, 35));
        getContentPane().add(jlblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 250));
        getContentPane().add(jlblWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAccederActionPerformed
        user = jtxtUsuario.getText().trim();
        pass = jpswContra.getText().trim();
        if(!user.equals("") || !pass.equals("")){
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                    "select nombre_usuario, max_points from usuarios where email = '" + user
                    + "' and contra = '" + pass + "'");
                ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    String usuario = rs.getString("nombre_usuario");
                    String max_points = rs.getString("max_points");
                    Menu menu = new Menu(usuario);
                    menu.setVisible(true);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Datos de acceso incorrectos.");
                    jtxtUsuario.setText("");
                    jpswContra.setText("");
                }
            } catch (SQLException e) {
                System.err.println("Error al Acceder ");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }
    }//GEN-LAST:event_jbtnAccederActionPerformed

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
            java.util.logging.Logger.getLogger(Logeo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logeo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logeo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logeo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logeo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnAcceder;
    private javax.swing.JLabel jlblLogo;
    private javax.swing.JLabel jlblWallpaper;
    private javax.swing.JPasswordField jpswContra;
    private javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}
