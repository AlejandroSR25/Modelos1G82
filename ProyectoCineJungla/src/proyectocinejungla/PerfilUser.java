/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocinejungla;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class PerfilUser extends javax.swing.JPanel {

    static Usuario u;

    public PerfilUser(Usuario u) {
        this.u = u;
        initComponents();
        crearNuevosComponentes();
    }

    public static Usuario getU() {
        return u;
    }

    public static void setU(Usuario u) {
        PerfilUser.u = u;
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(229, 227, 227));
        setPreferredSize(new java.awt.Dimension(1920, 960));
        setRequestFocusEnabled(false);
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel2.setText("PERFIL");
        add(jLabel2);
        jLabel2.setBounds(100, 70, 260, 60);

        jPanel3.setPreferredSize(new java.awt.Dimension(1720, 730));
        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jPanel3.add(jLabel4);
        jLabel4.setBounds(59, 705, 383, 0);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CAMBIAR CORREO ELECTRONICO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 24))); // NOI18N
        jPanel1.setLayout(null);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(140, 130, 440, 34);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nuevo Correo Electronico:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 80, 440, 31);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Confirmar Correo Electronico:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(140, 180, 440, 31);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(140, 230, 440, 34);

        jButton1.setText("CAMBIAR");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(320, 290, 90, 23);

        jPanel3.add(jPanel1);
        jPanel1.setBounds(490, 370, 735, 350);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMACION PERSONAL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 24))); // NOI18N
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Puntos:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(50, 240, 90, 31);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel8.setText("Nombre:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(50, 100, 110, 31);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setText("Correo Electronico:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(50, 170, 230, 31);

        jPanel3.add(jPanel2);
        jPanel2.setBounds(100, 10, 735, 350);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CAMBIAR CONTRASEÑA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 24))); // NOI18N
        jPanel4.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contraseña:");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(150, 70, 440, 31);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel4.add(jPasswordField1);
        jPasswordField1.setBounds(150, 120, 440, 34);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Confirmar Contraseña:");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(150, 170, 440, 31);

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        jPanel4.add(jPasswordField2);
        jPasswordField2.setBounds(150, 220, 440, 34);

        jButton2.setText("CAMBIAR");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(320, 280, 90, 23);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(880, 10, 735, 350);

        add(jPanel3);
        jPanel3.setBounds(100, 130, 1720, 730);

        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("CERRAR SESION");
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(1630, 880, 190, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(String.valueOf(jPasswordField1.getPassword()).equals(String.valueOf(jPasswordField2.getPassword())) && !String.valueOf(jPasswordField1.getPassword()).equals("") && !String.valueOf(jPasswordField2.getPassword()).equals("")){
            BD.getInstance().cambiarContraseña(this.u.getId(), String.valueOf(jPasswordField1.getPassword()), "Cliente");
            JOptionPane.showMessageDialog(null, "La contraseña se modificó correctamente");
        }else
            JOptionPane.showMessageDialog(null, "Los campos no coinciden o estan vacios");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Sesion.getInstance().LogOut();
        MainPage.goMainPage();
        MainPage.account_label.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jTextField5.getText().equals(jTextField6.getText()) && !jTextField5.getText().equals("") && !jTextField6.getText().equals("")){
            BD.getInstance().cambiarCorreo(this.u.getId(), jTextField5.getText());
            JOptionPane.showMessageDialog(null, "El correo se modificó correctamente");
        }else
            JOptionPane.showMessageDialog(null, "Los campos no coinciden o estan vacios");
    }//GEN-LAST:event_jButton1ActionPerformed
    private void crearNuevosComponentes() {
        JLabel label_nombre_u = new JLabel();
        label_nombre_u.setFont(new java.awt.Font("Century Gothic", 0, 18));
        label_nombre_u.setText(this.u.getNombre());
        jPanel2.add(label_nombre_u);
        label_nombre_u.setBounds(170, 100, 520, 30);

        JLabel label_correo_u = new JLabel();
        label_correo_u.setFont(new java.awt.Font("Century Gothic", 0, 18));
        label_correo_u.setText(this.u.getCorreo());
        jPanel2.add(label_correo_u);
        label_correo_u.setBounds(290, 170, 410, 30);

        JLabel label_puntos_u = new JLabel();
        label_puntos_u.setFont(new java.awt.Font("Century Gothic", 0, 18));
        label_puntos_u.setText(String.valueOf(this.u.getPuntos()));
        jPanel2.add(label_puntos_u);
        label_puntos_u.setBounds(140, 240, 560, 30);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
