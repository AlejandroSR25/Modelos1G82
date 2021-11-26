//En esta clase se puede evidenciar el principio de Single Responsability.
import java.util.Scanner;

//Clase con metodos static para la lectura de datos por consola.
public class Leer{
  static Scanner sc = new Scanner(System.in);

  public static String leer(){
    return sc.nextLine();
  }
}
