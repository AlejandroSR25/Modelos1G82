package ejemplocommand2;

import java.util.Scanner;

/* The test class or client */
public class PressSwitch {
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String state = sc.nextLine();
    
    Light lamp = new Light();
    Command switchUp = new FlipUpCommand(lamp);
    Command switchDown = new FlipDownCommand(lamp);
    
    Switch mySwitch = new Switch(switchUp, switchDown);
    
    
    
    switch(state){
        case "ON":
            mySwitch.flipUp();
            break;
        case "OFF":
            mySwitch.flipDown();
            break;
        default:
            System.err.println("Argument \"ON\" or \"OFF\" is required.");
            System.exit(-1);
        }
    }
}
