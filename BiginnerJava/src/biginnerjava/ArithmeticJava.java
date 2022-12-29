
package biginnerjava;

import java.util.Scanner;

public class ArithmeticJava {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1, num2, result;
        System.out.print("Enter two number : ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        result = num1 + num2;
        System.out.println("Sum = "+result);
        
        result = num1 - num2;
        System.out.println("Sub ="+result);
        
        result = num1 * num2;
        System.out.println("Multi ="+result);
        
        result = num1 / num2;
        System.out.println("Div ="+result);
        
        result = num1 % num2;
        System.out.println("Reminder ="+result);
          
    }
}
