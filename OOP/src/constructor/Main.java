
package constructor;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        // Teacher Class..........
        
        Teacher teacher1 = new Teacher("Shifat", "male", 20);
        teacher1.displayInformation();
        
        Teacher teacher2 = new Teacher("Rabbi", "male", 30);
        teacher2.displayInformation();
        
        Teacher teacher3 = new Teacher();
        Teacher teacher4 = new Teacher( 24.55 );
        
        
        // RuternValue Class.........
        Scanner input = new Scanner(System.in);
        double x;
        System.out.print("Enter a value : ");
        x = input.nextDouble();
        RuternValue num1 = new RuternValue();
        double result = num1.squre( x);
        System.out.println("The squre of "+x+" is = "+result);
       
        result = num1.root( x);
        System.out.println("The root of "+x+" is = "+result);
        
        
    }
}
