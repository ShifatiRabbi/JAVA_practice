
package biginnerjava;

import java.util.Scanner;

public class AssignmentJava {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int x,y;
        System.out.print("Enter two number : ");
        x = input.nextInt();
        y = input.nextInt();
        
        x += y;
        System.out.println("X = "+x);
        
        x -= y;
        System.out.println("X = "+x);
        
        x *= y;
        System.out.println("X = "+x);
        
        x /= y;
        System.out.println("X = "+x);
        
        x %= y;
        System.out.println("X = "+x);
        
    }
}
