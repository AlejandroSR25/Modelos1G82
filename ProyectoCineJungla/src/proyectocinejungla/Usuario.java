package proyectocinejungla;


public class Usuario extends Persona{
    
    private String correo;
    private String contraseña;
    private int puntos;
    private int tiempo_obtencion_puntos; //en dias

    public Usuario(int id){
        setId(id);
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
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getTiempo_obtencion_puntos() {
        return tiempo_obtencion_puntos;
    }

    public void setTiempo_obtencion_puntos(int tiempo_obtencion_puntos) {
        this.tiempo_obtencion_puntos = tiempo_obtencion_puntos;
    }
}
