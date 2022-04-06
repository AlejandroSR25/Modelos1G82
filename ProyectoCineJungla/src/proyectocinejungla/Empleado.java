package proyectocinejungla;

import java.util.List;

public class Empleado extends Persona{
    
    private int cedula;
    private String contraseña;
    private String cargo;
    private int Salario; 
    private String fecha_inicio_contrato;
    private String cine_afiliado;
    
    public Empleado(int id){
        super(id);
    }
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
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

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Salario) {
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

    @Override
    public void rellenarDatos() {
        List<String> datos = BD.getInstance().solicitarDatosPersona(this, this.getId());
        super.setNombre(datos.get(0));
        this.setCedula(Integer.parseInt(datos.get(1)));
        this.setContraseña(datos.get(2));
        this.setCargo(datos.get(3));
        this.setFecha_inicio_contrato(datos.get(4));
        this.setSalario(Integer.parseInt(datos.get(5)));
        this.setCine_afiliado(datos.get(7));
    }
    
}
