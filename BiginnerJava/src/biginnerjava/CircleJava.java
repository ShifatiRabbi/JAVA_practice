
package biginnerjava;

import java.util.Scanner;

public class CircleJava {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double radius, area;
        System.out.print("Enter value of Radius : ");
        radius = input.nextDouble();
        
        area = 3.1416 * radius * radius;
        System.out.println("Area = "+area);
        
    }
}
