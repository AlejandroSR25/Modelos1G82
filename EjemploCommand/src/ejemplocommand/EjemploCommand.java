package ejemplocommand;

/*Cliente*/
public class EjemploCommand {
    
    public static void main(String[] args) {
        OperadorArchivoTexto Operador = new OperadorArchivoTexto();
        Operador.ejecutarOperacion(new AbrirArchivo(new ArchivoTexto("archivo1.txt")));
        Operador.ejecutarOperacion(new GuardarArchivo(new ArchivoTexto("archivo2.txt")));
    }
    
}
