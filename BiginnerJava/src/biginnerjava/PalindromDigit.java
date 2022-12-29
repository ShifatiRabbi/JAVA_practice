
package biginnerjava;

import java.util.Scanner;

public class PalindromDigit {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num, i, sum=0, temp;
        System.out.print("Enter any number : ");
        num = input.nextInt();
        
        temp = num;
        while( temp != 0 )
        {
            int rem = temp % 10;
            sum = sum * 10 + rem;
            temp = temp / 10;
            
        }
        if( sum == num )
        {
            System.out.println("The number "+num+" is a palindrom");
            
        }
        else
        {
            System.out.println("The number "+num+" is not a palindrom");
        }
        
    }
}
