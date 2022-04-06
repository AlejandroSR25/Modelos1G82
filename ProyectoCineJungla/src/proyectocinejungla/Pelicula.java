package proyectocinejungla;

public class Pelicula implements Producto{
    
    String nombre;
    String directorio_img;
    String descripcion;
    int calificacion;
    
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

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getDirectorio_img() {
        return directorio_img;
    }

    public void setDirectorio_img(String directorio_img) {
        this.directorio_img = directorio_img;
    }
    
    
    
}
