package proyectocinejungla;

import java.util.List;


public class Usuario extends Persona{
    
    private String correo;
    private String contraseña;
    private int puntos;
    private String tiempo_obtencion_puntos; //en dias
    
    public Usuario(int id){
        super(id);
    }
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getPuntos() {
        return this.puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getTiempo_obtencion_puntos() {
        return tiempo_obtencion_puntos;
    }

    public void setTiempo_obtencion_puntos(String tiempo_obtencion_puntos) {
        this.tiempo_obtencion_puntos = tiempo_obtencion_puntos;
    }

    @Override
    public void rellenarDatos() {
        
        List<String> datos = BD.getInstance().solicitarDatosPersona(this, this.getId());
        super.setNombre(datos.get(0));
        this.setCorreo(datos.get(1));
        this.setContraseña(datos.get(2));
        this.setPuntos(Integer.parseInt(datos.get(3)));
        this.setTiempo_obtencion_puntos((datos.get(4)));
    }
}
