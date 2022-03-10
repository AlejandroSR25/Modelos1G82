package ejemplocommand;

public class ArchivoTexto {
    
    private String nombre;
    
    public ArchivoTexto(String nombre){
        this.nombre = nombre;
    }
    
    public void abrir() {
        System.out.println("Abriendo archivo " + nombre);
    }
    
    public void guardar() {  
        System.out.println("Guardando archivo " + nombre);
    }
    
}
