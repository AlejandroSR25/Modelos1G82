package ejemplocommand;

/*Comando o Operacion*/
public class AbrirArchivo implements Operacion{
    
    private ArchivoTexto archivo;
    
    public AbrirArchivo(ArchivoTexto archivo){
        this.archivo = archivo;
    }
    
    @Override
    public void ejecutar(){
        archivo.abrir();
    }
}
