package proyectocinejungla;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class ProductoConcretoPanel extends JPanel{
    Producto prod;
    JLabel imagen;
    JLabel nombre;
    
    public ProductoConcretoPanel(Producto prod){
        this.prod = prod;
        initComponents();
    }
    
    private void initComponents(){
        this.setLayout(new java.awt.BorderLayout());
        this.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        this.setBackground(new java.awt.Color(255, 255, 255));
        
        this.imagen = new JLabel(new javax.swing.ImageIcon(getClass().getResource(this.prod.getDirectorio())));
        this.add(this.imagen, java.awt.BorderLayout.NORTH);
        
        this.nombre = new JLabel(this.prod.getNombre());
        this.nombre.setFont(new java.awt.Font("Century Gothic", 1, 24));
        this.nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        this.nombre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        this.add(this.nombre, java.awt.BorderLayout.SOUTH);
        
    }
}
