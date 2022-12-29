
package biginnerjava;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num,i,sum=0;
        System.out.print("Enter any number : ");
        num = input.nextInt();
        
        while(num!=0)
        {
            int rem = num%10;
            sum = sum + rem;
            num = num/10;
        }
        
        System.out.println("The sum is "+sum);
        
    }
}
