/*Clase que hereda de Moto e implementa la interfaz IMotoGasolina
 * @author: Dylan Solarte, Sergio Sierra, Cristian Agudelo
 * @version: 29/11/2021/A
 */
public class Honda extends Moto implements IMotoGasolina{
  int kilometraje;
  int gasolina;

//Constructor
  public Honda(){
    this.kilometraje=0;
    this.gasolina=100;
  }

  /**Constructor con parametros
  * @param kilometraje	
  * @param gasolina
  */
  public Honda(int kilometraje, int gasolina){
    this.kilometraje=kilometraje;
    this.gasolina=gasolina;
  }
  
  /*Metodo que retorna el valor del atributo kilometraje.
  * @Override
  * @return int
  */
  public int mostrarKilometraje(){
    return this.kilometraje;
  }
  
  /*Metodo que al llamarse resta gasolina y suma kilometraje, en caso de que no haya gasolina se pedira por consola una cantidad a tanquear y se llamara la funcion tanquear().
  * @Override
  */
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
  
  /*Metodo que suma a la variable gasolina.
  * @Override
  * @param cantidad_tanqueo
  */
  
  public void tanquear(int cantidad_tanqueo){
    this.gasolina += cantidad_tanqueo;
    if(this.gasolina>100){
      this.gasolina=100;
    }
  }
}
