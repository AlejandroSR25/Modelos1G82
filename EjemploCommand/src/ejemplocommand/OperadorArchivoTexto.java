package ejemplocommand;

import java.util.ArrayList;
import java.util.List;

public class OperadorArchivoTexto {
    
    private final List<Operacion> Operaciones = new ArrayList<>();
    
    public void executeOperation(Operacion op) {
        Operaciones.add(op);
        op.ejecutar();
    }
    
}
