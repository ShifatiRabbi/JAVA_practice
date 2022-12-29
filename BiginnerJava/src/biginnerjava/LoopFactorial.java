
package biginnerjava;

import java.util.Scanner;

public class LoopFactorial {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num,i,fact=1;
        System.out.print("Enter a number : ");
        
        num = input.nextInt();
        for( i = num; i>=1; i-- )
        {
            fact = fact * i;
        }
        System.out.println("The factorial of "+num+" is "+fact);
        
    }
}
