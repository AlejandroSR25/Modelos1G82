/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocinejungla;

import java.awt.Color;
import java.awt.Component;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author USUARIO
 */
public class SillasPanel extends javax.swing.JPanel {

    private BD baseDatos = BD.getInstance();
    private static final int INICIO_X_P = 118;
    private static final int INICIO2_X_P = 712;
    private static final int INICIO_X_G = 316;
    private static final int INICIO_Y = 53;
    private static final int DESP_X = 16;
    private static final int DESP_Y = 26;
    PerfilUser user = new PerfilUser((Usuario) Sesion.getInstance().getPersona());
    private int funcion;
    private static Sala sala = new Sala();
    List<String> numero = new ArrayList<>();
    

    /**
     * Creates new form Comida
     */
    public SillasPanel(int funcion) {

        this.funcion = funcion;
        initComponents();
        iniciar();
        labelSala.setText(baseDatos.fun(funcion, MainPage.getCineId()).get(0));
        
    }

    public static JLabel getCantG() {
        return cantG;
    }

    public static void setCantG(JLabel cantG) {
        SillasPanel.cantG = cantG;
    }

    public static JLabel getCantP() {
        return cantP;
    }

    public static void setCantP(JLabel cantP) {
        SillasPanel.cantP = cantP;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        imgG = new javax.swing.JLabel();
        labelG = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        imgG1 = new javax.swing.JLabel();
        labelG1 = new javax.swing.JLabel();
        imgG2 = new javax.swing.JLabel();
        labelG2 = new javax.swing.JLabel();
        imgG3 = new javax.swing.JLabel();
        labelG3 = new javax.swing.JLabel();
        cantG = new javax.swing.JLabel();
        labelSala = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cantP = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        radioBoton = new javax.swing.JRadioButton();
        radioBoton1 = new javax.swing.JRadioButton();
        radioBoton2 = new javax.swing.JRadioButton();
        radioBoton3 = new javax.swing.JRadioButton();
        botonComprar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(229, 227, 227));
        setPreferredSize(new java.awt.Dimension(1920, 960));
        setRequestFocusEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel2.setText("Elije la silla");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 330, 60));

        jPanel3.setPreferredSize(new java.awt.Dimension(1720, 2000));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sillaG.png"))); // NOI18N
        jPanel3.add(imgG, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 100, 100));

        labelG.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        labelG.setText("Silla General");
        jPanel3.add(labelG, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 100, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel3.setText("Convencion");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 190, 30));

        imgG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sillaP.png"))); // NOI18N
        jPanel3.add(imgG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 100, 100));

        labelG1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        labelG1.setText("Silla Preferencial");
        jPanel3.add(labelG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 130, 30));

        imgG2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sillaS.png"))); // NOI18N
        jPanel3.add(imgG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 100, 100));

        labelG2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        labelG2.setText("Silla Seleccionada");
        jPanel3.add(labelG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 140, 30));

        imgG3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sillaO.png"))); // NOI18N
        jPanel3.add(imgG3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 100, 100));

        labelG3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        labelG3.setText("Silla Ocupada");
        jPanel3.add(labelG3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 660, 120, 30));

        cantG.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        cantG.setText("0");
        jPanel3.add(cantG, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 130, 70, 70));

        labelSala.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jPanel3.add(labelSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 320, 90, 70));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setText("Generales:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 130, 140, 70));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setText("Pago:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 370, 180, 70));

        cantP.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        cantP.setText("0");
        jPanel3.add(cantP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 220, 70, 70));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel8.setText("Preferenciales:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 220, 180, 70));

        grupoBotones.add(radioBoton);
        radioBoton.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        radioBoton.setText("Tarjeta de credito");
        radioBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBotonActionPerformed(evt);
            }
        });
        jPanel3.add(radioBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 440, 170, 40));

        grupoBotones.add(radioBoton1);
        radioBoton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        radioBoton1.setText("PSE");
        radioBoton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBoton1ActionPerformed(evt);
            }
        });
        jPanel3.add(radioBoton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 480, 170, 40));

        grupoBotones.add(radioBoton2);
        radioBoton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        radioBoton2.setText("Efectivo (efecty,baloto,etc..)");
        radioBoton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBoton2ActionPerformed(evt);
            }
        });
        jPanel3.add(radioBoton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 520, 230, 40));

        grupoBotones.add(radioBoton3);
        radioBoton3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        radioBoton3.setText("Redencion de puntos Cine Junlga (100 pts)");
        radioBoton3.setEnabled(false);
        radioBoton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                radioBoton3MouseEntered(evt);
            }
        });
        radioBoton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBoton3ActionPerformed(evt);
            }
        });
        jPanel3.add(radioBoton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 560, 330, 40));

        botonComprar.setBackground(new java.awt.Color(204, 0, 51));
        botonComprar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonComprar.setForeground(new java.awt.Color(255, 255, 255));
        botonComprar.setText("Comprar");
        botonComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonComprar.setEnabled(false);
        botonComprar.setFocusable(false);
        botonComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonComprarMouseEntered(evt);
            }
        });
        botonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComprarActionPerformed(evt);
            }
        });
        jPanel3.add(botonComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 650, 150, 40));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel7.setText("Entradas");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 60, 280, 70));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel9.setText("Sala:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 320, 90, 70));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("$15.000 c/u");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 280, 120, 30));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("$11.000 c/u");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 196, 120, 30));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 1720, 780));
    }// </editor-fold>//GEN-END:initComponents

    private void radioBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBotonActionPerformed
        // TODO add your handling code here:
        if ((Integer.parseInt(cantG.getText()) > 0) || (Integer.parseInt(cantP.getText()) > 0)) {
            botonComprar.setEnabled(true);
        }

    }//GEN-LAST:event_radioBotonActionPerformed

    private void radioBoton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBoton1ActionPerformed
        // TODO add your handling code here:
        if ((Integer.parseInt(cantG.getText()) > 0) || (Integer.parseInt(cantP.getText()) > 0)) {
            botonComprar.setEnabled(true);
        }
    }//GEN-LAST:event_radioBoton1ActionPerformed

    private void radioBoton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBoton2ActionPerformed
        // TODO add your handling code here:
        if ((Integer.parseInt(cantG.getText()) > 0) || (Integer.parseInt(cantP.getText()) > 0)) {
            botonComprar.setEnabled(true);
        }
    }//GEN-LAST:event_radioBoton2ActionPerformed

    private void radioBoton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBoton3ActionPerformed
        // TODO add your handling code here:
        if ((Integer.parseInt(cantG.getText()) > 0) || (Integer.parseInt(cantP.getText()) > 0)) {
            botonComprar.setEnabled(true);
        }
        
    }//GEN-LAST:event_radioBoton3ActionPerformed

    private void botonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprarActionPerformed
        // TODO add your handling code here:
        int contador=0;
        for (int i = 0; i < 60; i++) {
            if (sala.getSillas().get(i).getType().getEstado().equals("Seleccionada")) {
                String aux = "" + funcion;
                baseDatos.modifEstado(MainPage.getCineId(), "Ocupada",numero.get(i), aux);
                //System.out.print("update Cine" + MainPage.getCineId() + " set Estado='" + "Ocupada" + "' where Silla='" + numero.get(i) + "', Funcion='" + aux + "';");
                contador++;
            }
            
        }
        
       
        
        if(radioBoton3.isSelected())
        {
           int puntAct=user.getU().getPuntos();
           baseDatos.modifPuntos(""+user.getU().getId(), puntAct-100);
           user.getU().setPuntos(puntAct-100);
           baseDatos.modifFecha(""+user.getU().getId(), "0");
        }else{
            int puntAct=user.getU().getPuntos();
            int puntos=10*contador;
            baseDatos.modifPuntos(""+user.getU().getId(), puntAct+puntos);
            
           user.getU().setPuntos(puntAct+puntos);
            if(puntAct+puntos>=100)
            {
                LocalDate fecha = LocalDate.now();
                baseDatos.modifFecha(""+user.getU().getId(), ""+fecha);
            }
        }
        
        
        JFrame exito = new CompraExitosa();
        exito.setVisible(true);
        exito.setLocationRelativeTo(null);
    }//GEN-LAST:event_botonComprarActionPerformed

    private void botonComprarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonComprarMouseEntered
        // TODO add your handling code here:
        if ((Integer.parseInt(cantG.getText()) > 0) || (Integer.parseInt(cantP.getText()) > 0) &&(radioBoton.isSelected() ||radioBoton1.isSelected() ||radioBoton2.isSelected()||radioBoton3.isSelected() )) {
            botonComprar.setEnabled(true);
        }else{
            botonComprar.setEnabled(false);
        }
        
    }//GEN-LAST:event_botonComprarMouseEntered

    private void radioBoton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioBoton3MouseEntered
        // TODO add your handling code here:
        if(user.getU().getPuntos()>=100)
        {
            radioBoton3.setEnabled(true);
        }
    }//GEN-LAST:event_radioBoton3MouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonComprar;
    private static javax.swing.JLabel cantG;
    private static javax.swing.JLabel cantP;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JLabel imgG;
    private javax.swing.JLabel imgG1;
    private javax.swing.JLabel imgG2;
    private javax.swing.JLabel imgG3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelG;
    private javax.swing.JLabel labelG1;
    private javax.swing.JLabel labelG2;
    private javax.swing.JLabel labelG3;
    private javax.swing.JLabel labelSala;
    private javax.swing.JRadioButton radioBoton;
    private javax.swing.JRadioButton radioBoton1;
    private javax.swing.JRadioButton radioBoton2;
    private javax.swing.JRadioButton radioBoton3;
    // End of variables declaration//GEN-END:variables

    public static Sala getSala() {
        return sala;
    }

    public void iniciar() {
        sala = new Sala();
        sala.getAccio().clear();
        sala.getSillas().clear();
        int x = 0;
        int y = 0;
        List<String> sillas = baseDatos.sala(funcion, MainPage.getCineId());
        List<String> tipos = new ArrayList<>();
        List<String> estados = new ArrayList<>();
        for (int i = 0; i < 180; i += 3) {
            numero.add(sillas.get(i));
        }
        for (int i = 1; i < 180; i += 3) {
            tipos.add(sillas.get(i));
        }
        for (int i = 2; i < 180; i += 3) {
            estados.add(sillas.get(i));
        }
        for (int i = 0; i < 60; i++) {
            sala.plantSilla(cambioColumna(numero.get(i)), cambioFila(numero.get(i)), tipos.get(i), estados.get(i));
        }
        
        if(user.getU().getPuntos()>=100)
        {
            radioBoton3.setEnabled(true);
        }
        
        
        sala.setBounds(280, 110, 880, 530);
        sala.setVisible(true);
        jPanel3.add(sala, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 15, 880, 750));

    }

    public int cambioFila(String silla) {
        char columna = silla.charAt(1);
        switch (columna) {
            case 'A':
                return INICIO_Y;
            case 'B':
                return (INICIO_Y + 50 + DESP_Y);
            case 'C':
                return INICIO_Y + ((50 + DESP_Y) * 2);
            case 'D':
                return INICIO_Y + ((50 + DESP_Y) * 3);
            case 'E':
                return INICIO_Y + ((50 + DESP_Y) * 4);
            case 'F':
                return INICIO_Y + ((50 + DESP_Y) * 5);
            case 'G':
                return INICIO_Y + ((50 + DESP_Y) * 6);
            case 'H':
                return INICIO_Y + ((50 + DESP_Y) * 7);
        }
        return 0;

    }

    public int cambioColumna(String silla) {
        char fila = silla.charAt(2);
        int ent = Character.getNumericValue(fila);
        switch (ent) {
            case 1:
                return INICIO_X_P;
            case 2:
                return INICIO_X_P + 50 + DESP_X;
            case 3:
                return INICIO_X_G;
            case 4:
                return INICIO_X_G + DESP_X + 50;
            case 5:
                return INICIO_X_G + ((50 + DESP_X) * 2);
            case 6:
                return INICIO_X_G + ((50 + DESP_X) * 3);
            case 7:
                return INICIO_X_G + ((50 + DESP_X) * 4);
            case 8:
                return INICIO2_X_P;
            case 9:
                return INICIO2_X_P + 50 + DESP_X;
        }
        return 0;

    }

}
