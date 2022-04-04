/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocinejungla;

import java.awt.Graphics;

/**
 *
 * @author User
 */
public class Silla {
    private int x;
    private int y;
    private SillaTipo type;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public SillaTipo getType() {
        return type;
    }

    public void setType(SillaTipo type) {
        this.type = type;
    }

    
    
    public Silla(int x, int y, SillaTipo type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        
        type.draw(g, x, y);
    }
}
