
package biginnerjava;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int num1;
        System.out.print("Enter a number : ");
        num1 = input.nextInt();
        
        if(num1%2==0)
        {
            System.out.println("The number is EVEN");
        }
        else
        {
            System.out.println("The number is ODD");
        }
        
        
    }
}
