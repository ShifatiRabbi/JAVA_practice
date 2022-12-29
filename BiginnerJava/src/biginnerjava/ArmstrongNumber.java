
package biginnerjava;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, i, sum=0, temp;
        System.out.print("Enter a number : ");
        num = input.nextInt();
        
        temp = num;
        while( temp != 0)
        {
            int rem = temp % 10;
            sum = (int) (sum + Math.pow(rem, 3));
            temp = temp / 10;
        }
        if(num == sum)
        {
            System.out.println("The number is Armstrong number");
            
        }
        else
        {
            System.out.println("The number is not Armstrong number");
        }
    }
}
