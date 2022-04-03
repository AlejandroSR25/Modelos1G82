/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocinejungla;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class SillaTipo {

    private String tipo;
    private String estado;
    private String url;

    public SillaTipo(String tipo, String estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    public void draw(Graphics g, int x, int y) {
        direccion();
        g.drawImage(new ImageIcon(url).getImage(), x, y, null);
    }

    public void direccion() {
        url = "";
        url = "src\\Imagenes\\";
        if (estado.equals("Libre")) {
            if (tipo.equals("General")) {
                url += "sillaGeneral.png";
            } else {
                url += "sillaPreferencial.png";
            }
            
        } else {
            url += "sillaSelecionada.png";
        }

    }

}
