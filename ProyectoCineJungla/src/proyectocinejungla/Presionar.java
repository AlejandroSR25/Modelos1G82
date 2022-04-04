/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocinejungla;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

/**
 *
 * @author User
 */
public class Presionar implements MouseListener {
    
    
    private BD baseDatos = BD.getInstance();

    @Override
    public void mouseClicked(MouseEvent me) {
        for (int i = 0; i < 60; i++) {
            if (me.getSource().equals(Sala.getAccio().get(i))) {
                if(SillasPanel.getSala().getSillas().get(i).getType().getEstado().equals("Libre"))
                {
                     //baseDatos.modifEstado("Seleccionada", Sala.getAccio().get(i).getText(), 1);
                     SillasPanel.getSala().getSillas().get(i).getType().setEstado("Seleccionada");
                     SillasPanel.getSala().repaint();
                     
                }else{
                    SillasPanel.getSala().getSillas().get(i).getType().setEstado("Libre");
                     //baseDatos.modifEstado("Libre", Sala.getAccio().get(i).getText(), 1);
                     SillasPanel.getSala().repaint();
                     //SillasPanel.getSala().getContentPane().revalidate();
                     
                }
                break;
            }
        }

    }

    @Override
    public void mousePressed(MouseEvent me) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mouseExited(MouseEvent me) {

    }

}
