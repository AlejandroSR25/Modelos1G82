package proyectocinejungla;

public final class Sesion {
    
    private boolean logged;
    private Persona persona;
    
    static Sesion s = null;
    
    private Sesion(){
        this.logged = false;
        this.persona = null;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    public static Sesion getInstance(){
        if(s == null){
            s = new Sesion();
        } 
        return s;
    }

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }
}
