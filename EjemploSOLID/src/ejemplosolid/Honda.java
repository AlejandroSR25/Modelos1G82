public class Honda extends Moto implements IMotoGasolina{
  int kilometraje;
  int gasolina;


  public Honda(){
    this.kilometraje=0;
    this.gasolina=100;
  }

  public Honda(int kilometraje, int gasolina){
    this.kilometraje=kilometraje;
    this.gasolina=gasolina;
  }

  @Override
  public int mostrarKilometraje(){
    return this.kilometraje;
  }

  @Override
  public void conducir(){
    if(this.gasolina>0){
      this.kilometraje+=10;
      this.gasolina-=10;
    }
    else{
      System.out.println("No hay suficiente combustible, por favor ingrese la cantidad a tanquear\n");
      int cantidad_tanqueo = Integer.parseInt(Leer.leer());
      tanquear(cantidad_tanqueo);
      System.out.println("Tanqueo exitoso, se procedera a conducir el vehiculo");
      conducir();
    }
  }
  
  @Override
  public void tanquear(int cantidad_tanqueo){
    this.gasolina += cantidad_tanqueo;
    if(this.gasolina>100){
      this.gasolina=100;
    }
  }
}
