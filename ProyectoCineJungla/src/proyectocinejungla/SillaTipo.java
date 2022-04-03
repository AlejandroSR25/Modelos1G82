/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocinejungla;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class SillaTipo {

    private String tipo;
    private String estado;
    private String url;
    public static List<Image> imagenes = new ArrayList<>();

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    
    
    public SillaTipo(String tipo, String estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    public void draw(Graphics g, int x, int y) {
        direccion();
        Image img = new ImageIcon(url).getImage();
        imagenes.add(img);
        g.drawImage(img, x, y, null);
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
            if (estado.equals("Seleccionada")) {
                url += "sillaSelecionada.png";
            } else {
                url += "sillaOcupada.png";
            }
        }

    }

}
