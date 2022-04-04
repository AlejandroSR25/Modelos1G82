package proyectocinejungla;

public final class Sesion {
    
    boolean logged;
    
    static Sesion s = null;
    
    private Sesion(){
        this.logged = false;
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
