/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocinejungla;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author USUARIO
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * 
     * Creates new form MainPage
     */
    
    private BD baseDatos;
    private Sesion sesion = Sesion.getInstance();
    private JFrame frame;
    public static int cine; 
    public static int puntCine;  
    List<Pelicula> peliculas = new ArrayList<>();
    
    public MainPage() {
        this.frame=this;
        initComponents();
        cartelera();
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
        jLabel8 = new javax.swing.JLabel();
        cartelera = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        encabezado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(6);
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 95));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SELECCIONA UN MULTIPLEX");
        jLabel8.setPreferredSize(new java.awt.Dimension(700, 60));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(686, 686, 686)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(534, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(450, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 120, 1920, 960);

        cartelera.setBackground(new java.awt.Color(229, 227, 227));
        cartelera.setEnabled(false);
        cartelera.setPreferredSize(new java.awt.Dimension(1920, 960));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel2.setText("EN CARTELERA");

        jPanel3.setPreferredSize(new java.awt.Dimension(1720, 2000));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 75, 50);
        flowLayout1.setAlignOnBaseline(true);
        jPanel3.setLayout(flowLayout1);

        

        javax.swing.GroupLayout carteleraLayout = new javax.swing.GroupLayout(cartelera);
        cartelera.setLayout(carteleraLayout);
        carteleraLayout.setHorizontalGroup(
            carteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carteleraLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1560, Short.MAX_VALUE))
            .addGroup(carteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(carteleraLayout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(100, Short.MAX_VALUE)))
        );
        carteleraLayout.setVerticalGroup(
            carteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carteleraLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel2)
                .addContainerGap(837, Short.MAX_VALUE))
            .addGroup(carteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(carteleraLayout.createSequentialGroup()
                    .addGap(114, 114, 114)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(115, Short.MAX_VALUE)))
        );

        getContentPane().add(cartelera);
        cartelera.setBounds(0, 120, 1920, 960);

        encabezado.setBackground(new java.awt.Color(189, 40, 47));
        encabezado.setPreferredSize(new java.awt.Dimension(1920, 120));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MainPage/Header.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MainPage/Buttons/UserIcon/UserIcon.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MainPage/Buttons/Cartelera_button.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setEnabled(false);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MainPage/Buttons/Comidas_button.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.setEnabled(false);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(189, 40, 47));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Titan", "Unicentro", "Plaza Central", "Gran Estación", "Embajador", "Las Americas" }));
        jComboBox1.setToolTipText("");
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.setFocusable(false);
        jComboBox1.setOpaque(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MULTIPLEX");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MainPage/Estrella Roja.png"))); // NOI18N
        jLabel7.setText("PUNTUA NUESTROS SERVICIOS");
        jLabel7.setEnabled(false);

        jLabel3.setVisible(false);
        jLabel4.setVisible(false);;
        jLabel7.setVisible(false);

        javax.swing.GroupLayout encabezadoLayout = new javax.swing.GroupLayout(encabezado);
        encabezado.setLayout(encabezadoLayout);
        encabezadoLayout.setHorizontalGroup(
            encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encabezadoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel6)
                .addGap(30, 30, 30)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(57, 57, 57)
                .addComponent(jLabel4)
                .addGap(82, 82, 82)
                .addComponent(jLabel5)
                .addGap(121, 121, 121))
        );
        encabezadoLayout.setVerticalGroup(
            encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encabezadoLayout.createSequentialGroup()
                .addGroup(encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(encabezadoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(encabezadoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23))
        );

        getContentPane().add(encabezado);
        encabezado.setBounds(0, 0, 1920, 120);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MainPage/Buttons/Cartelera_button_entered.png")));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MainPage/Buttons/Cartelera_button.png")));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MainPage/Buttons/UserIcon/UserIcon_entered.png")));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MainPage/Buttons/UserIcon/UserIcon.png")));
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MainPage/Buttons/Comidas_button_entered.png")));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MainPage/Buttons/Comidas_button.png")));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        getContentPane().removeAll();
        getContentPane().add(encabezado).setBounds(0, 0, 1920, 120);
        getContentPane().add(new ComidaGUI()).setBounds(0, 120, 1920, 960);
        getContentPane().revalidate();
        getContentPane().repaint();
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        getContentPane().removeAll();
        getContentPane().add(encabezado).setBounds(0, 0, 1920, 120);
        getContentPane().add(cartelera).setBounds(0, 120, 1920, 960);
        getContentPane().revalidate();
        getContentPane().repaint();
    }//GEN-LAST:event_jLabel3MouseClicked

    public static JPanel getEncabezado() {
        return encabezado;
    }

    
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(jComboBox1.getSelectedItem() == jComboBox1.getItemAt(0)){
            
            getContentPane().add(jPanel1, 0);
            
            jLabel3.setEnabled(false);
            jLabel3.setVisible(false);
            jLabel4.setEnabled(false);
            jLabel4.setVisible(false);
            jLabel7.setEnabled(false);
            jLabel7.setVisible(false);
            cartelera.setEnabled(false);
                        
            getContentPane().revalidate();
            getContentPane().repaint();
            
        }else{
            
            getContentPane().remove(jPanel1);

            jLabel3.setEnabled(true);
            jLabel3.setVisible(true);
            jLabel4.setEnabled(true);
            jLabel4.setVisible(true);
            jLabel7.setEnabled(true);
            jLabel7.setVisible(true);
            cartelera.setEnabled(true);
                        
            getContentPane().revalidate();
            getContentPane().repaint();
        }            
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        
        if(!sesion.isLogged()){
            Login frame_user_login = new Login();
            frame_user_login.setVisible(true);
            this.setEnabled(false);
        }else{
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void JPanelPeliculaMouseClicked(java.awt.event.MouseEvent evt, Pelicula peli, JFrame frame){
        if(cartelera.isEnabled()){
            getContentPane().removeAll();
            getContentPane().add(encabezado).setBounds(0, 0, 1920, 120);
            getContentPane().add(new PeliculaGUI(peli, this)).setBounds(0, 120, 1920, 960);
            getContentPane().revalidate();
            getContentPane().repaint();
        }
    }
    
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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cartelera;
    private static javax.swing.JPanel encabezado;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables


    public void cartelera()
    {
        baseDatos=BD.getInstance();
        List<String> id = new ArrayList<>();
        List<String> nombre = new ArrayList<>();
        List<String> descrip = new ArrayList<>();
        for (int i = 0; i < baseDatos.cartelera().size(); i += 4) {
            id.add(baseDatos.cartelera().get(i));
        }
        for (int i = 1; i < baseDatos.cartelera().size(); i += 4) {
            nombre.add(baseDatos.cartelera().get(i));
        }
        for (int i = 2; i < baseDatos.cartelera().size(); i += 4) {
            descrip.add(baseDatos.cartelera().get(i));
        }
        for(int i=0;i<id.size();i++){
            jPanel3.add(new ProductoConcretoPanel(new Pelicula(nombre.get(i), "/Imagenes/Productos/Pelicula/"+id.get(i) +".jpg", descrip.get(i))));
            peliculas.add(new Pelicula(nombre.get(i), "/Imagenes/Productos/Pelicula/"+id.get(i) +".jpg", descrip.get(i)));
        }

        
        Component[] cmp = jPanel3.getComponents();

        for(int i=0;i<4;i++){
            Pelicula aux =peliculas.get(i);
            if(cmp[i] instanceof javax.swing.JPanel){
                cmp[i].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                cmp[i].addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        JPanelPeliculaMouseClicked(evt, aux, frame);
                    }
                });
            }
        }
    }
}

