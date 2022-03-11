package ejemplocommand;

import java.util.ArrayList;
import java.util.List;

/*Invoker*/
public class OperadorArchivoTexto {
    
    private final List<Operacion> Operaciones = new ArrayList<>();
    
    public void ejecutarOperacion(Operacion op) {
        Operaciones.add(op);
        op.ejecutar();
    }
    
}
