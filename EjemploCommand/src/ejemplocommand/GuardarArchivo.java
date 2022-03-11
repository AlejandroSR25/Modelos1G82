package ejemplocommand;

/*Comando o Operacion*/
public class GuardarArchivo implements Operacion{
    
    private ArchivoTexto archivo;
    
    public GuardarArchivo(ArchivoTexto archivo){
        this.archivo = archivo;
    }
    
    @Override
    public void ejecutar(){
        archivo.guardar();
    }
}
