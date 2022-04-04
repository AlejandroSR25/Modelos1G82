/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocinejungla;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Sala extends JPanel {

    private List<Silla> sillas = new ArrayList<>();
    private static List<JLabel> accio = new ArrayList<>();
    Presionar pre = new Presionar();

    public static List<JLabel> getAccio() {
        return accio;
    }

    public List<Silla> getSillas() {
        return sillas;
    }
    
    
    public void plantSilla(int fila, int columna, String tipoSil, String estado) {
        SillaTipo tipo = FabricaSilla.getSillaTipo(tipoSil, estado);
        Silla silla = new Silla(fila, columna, tipo);
        sillas.add(silla);
    }

    public void paint(Graphics g) {
        g.drawImage(new ImageIcon("src\\Imagenes\\fondo.png").getImage(), 0, 0, null);
        for (Silla silla : sillas) {
            silla.draw(g);
            //System.out.print(silla.getType().getEstado());
        }
        acciones();
        
    }

    
    
    public void acciones() {
        for (int i = 0; i < 60; i++) {
            JLabel accion = new JLabel();
            accion.setBounds(sillas.get(i).getX(), sillas.get(i).getY(), 50, 50);
            accion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            this.add(accion);
            accio.add(accion);
            
            accion.addMouseListener(pre);
        }
    }

}
