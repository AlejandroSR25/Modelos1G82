/*En esta clase se puede evidenciar el principio de Single Responsability.
 * @author: Dylan Solarte, Sergio Sierra, Cristian Agudelo
 * @version: 29/11/2021/A
 */
import java.util.Scanner;

//Clase con metodos static para la lectura de datos por consola.
public class Leer{
  static Scanner sc = new Scanner(System.in);

  public static String leer(){
    return sc.nextLine();
  }
}
