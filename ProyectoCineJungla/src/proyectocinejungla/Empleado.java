package proyectocinejungla;

public class Empleado extends Persona{
    
    private String cedula;
    private String contraseña;
    private String cargo;
    private String Salario; 
    private String fecha_inicio_contrato;
    
    public Empleado(int id){
        setId(id);
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSalario() {
        return Salario;
    }

    public void setSalario(String Salario) {
        this.Salario = Salario;
    }

    public String getFecha_inicio_contrato() {
        return fecha_inicio_contrato;
    }

    public void setFecha_inicio_contrato(String fecha_inicio_contrato) {
        this.fecha_inicio_contrato = fecha_inicio_contrato;
    }

    public String getCine_afiliado() {
        return cine_afiliado;
    }

    public void setCine_afiliado(String cine_afiliado) {
        this.cine_afiliado = cine_afiliado;
    }
    String cine_afiliado;
    
}
