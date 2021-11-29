/*En esta clase se puede evidenciar los principios de Liskov Substitution y Dependency Inversion.
 * @author: Dylan Solarte, Sergio Sierra, Cristian Agudelo
 * @version: 29/11/2021/A
 */
class Main {
  public static void main(String[] args) {
    
    //Se crea array de tipo Moto donde se añaden objetos de clases hijas de Moto.
    Moto[] arrayMotos = {
      new Honda(),
      new Kawasaki(10, 90),
      new Yamaha(20, 80),
      new Starker()
    };
    
    //For each para recorrer el arreglo de motos y llamar los metodos de las clases.
    for(Moto moto: arrayMotos){
      moto.conducir();
      System.out.println(moto.mostrarKilometraje());
      System.out.println(moto.getClass());
    }

  }
}
