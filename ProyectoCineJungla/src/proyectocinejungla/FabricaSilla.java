/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocinejungla;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class FabricaSilla {

    static Map<String, SillaTipo> sillaTipo = new HashMap<>();

    public static SillaTipo getSillaTipo(String tipo, String estado) {
        SillaTipo result = sillaTipo.get(tipo);
        if (result == null) {
            result = new SillaTipo(tipo,estado);
            sillaTipo.put(tipo, result);
        }
        return result;
    }
}
