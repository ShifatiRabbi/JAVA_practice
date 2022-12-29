
package biginnerjava;

import java.util.Scanner;

public class TemparetureJava {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double cel, fer, result;
        
        System.out.print("Enter the value of Celcius : ");
        cel = input.nextDouble();
        
        result = ( 1.8 * cel ) + 32;
        System.out.println("Ferenheight tempareture is = "+result);
        
        System.out.print("Enter the value of Ferenheight : ");
        fer = input.nextDouble();
        
        result = (fer - 32) / 9 * 5;
        System.out.println("Celcius tempareture is = "+result);
     
    }
}
