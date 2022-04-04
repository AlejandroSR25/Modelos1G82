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
    private  String estado;
    private  String url;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   

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
        switch (estado) {
            case "Libre":
                if (tipo.equals("General")) {
                    url += "sillaGeneral.png";
                } else {
                    url += "sillaPreferencial.png";
                }
                break;
            case "Seleccionada":
                url += "sillaSelecionada.png";
                break;
            case "Ocupada":
                url += "sillaOcupada.png";
                break;
        }
       

    }

}
