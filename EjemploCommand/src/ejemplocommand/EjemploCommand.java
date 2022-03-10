package ejemplocommand;

public class EjemploCommand {
    
    public static void main(String[] args) {
        OperadorArchivoTexto Operador = new OperadorArchivoTexto();
    Operador.executeOperation(new AbrirArchivo(new ArchivoTexto("archivo1.txt")));
    Operador.executeOperation(new GuardarArchivo(new ArchivoTexto("archivo2.txt")));
    }
    
}
