package proyectocinejungla;

public class Pelicula implements Producto{
    
    String nombre;
    String directorio_img;
    String descripcion;
    
    public Pelicula(String nombre, String directorio_img, String descripcion){
        this.nombre = nombre;
        this.directorio_img = directorio_img;
        this.descripcion = descripcion;
    }

    @Override
    public String getDirectorio() {
        return this.directorio_img;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }
    
}
