public class Starker extends Moto implements IMotoElectrica{
  int kilometraje;
  int porcentaje_bateria;

  public Starker(){
    this.kilometraje=0;
    this.porcentaje_bateria=100;
  }

  public Starker(int kilometraje, int porcentaje_bateria){
    this.kilometraje=kilometraje;
    this.porcentaje_bateria=porcentaje_bateria;
  }

  @Override
  public int mostrarKilometraje(){
    return this.kilometraje;
  }

  @Override
  public void conducir(){
    if(this.porcentaje_bateria>0){
      this.kilometraje+=10;
      this.porcentaje_bateria-=10;
    }
    else{
      System.out.println("No hay suficiente carga, ingrese la cantidad a cargar\n");
      int cantidad_carga = Integer.parseInt(Leer.leer());
      cargarBateria(cantidad_carga);
      System.out.println("Carga exitosa, se procedera a conducir el vehiculo");
      conducir();
    }
  }

  @Override
  public void cargarBateria(int cantidad_carga){
    this.porcentaje_bateria += cantidad_carga;
    if(this.porcentaje_bateria>100)
      this.porcentaje_bateria=100;
  }
}