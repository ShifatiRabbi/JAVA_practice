
package biginnerjava;

import java.util.Scanner;

public class TringleJava {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double base, height, area;
        System.out.print("Enter value of Base and Height : ");
        base = input.nextDouble();
        height = input.nextDouble();
        
        area = 0.5 * base * height;
        System.out.println("Area = "+area);
        
    }
}