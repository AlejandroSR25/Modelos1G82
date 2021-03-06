/*Clase que hereda de Moto e implementa la interfaz IMotoGasolina
 * @author: Dylan Solarte, Sergio Sierra, Cristian Agudelo
 * @version: 29/11/2021/A
 */
public class Starker extends Moto implements IMotoElectrica{
  int kilometraje;
  int porcentaje_bateria;
  
//Constructor
  public Starker(){
    this.kilometraje=0;
    this.porcentaje_bateria=100;
  }

   /*Constructor con parametros
  * @param kilometraje	
  * @param porcentaje_bateria
  */
  public Starker(int kilometraje, int porcentaje_bateria){
    this.kilometraje=kilometraje;
    this.porcentaje_bateria=porcentaje_bateria;
  }

  
  /*Metodo Mostrar kilometraje 
  * @Override
  * @return int
  */
  public int mostrarKilometraje(){
    return this.kilometraje;
  }

  
  /*Metodo que al llamarse resta carga a la bateria y suma kilometraje, en caso de que no haya carga se pedira por consola una cantidad a cargarr y se llamara la funcion cargarBateria()
  * @Override
  */
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

  
  /*Metodo cargarBateria
  * @Override
  * @param cantidad_carga
  */
  public void cargarBateria(int cantidad_carga){
    this.porcentaje_bateria += cantidad_carga;
    if(this.porcentaje_bateria>100)
      this.porcentaje_bateria=100;
  }
}
