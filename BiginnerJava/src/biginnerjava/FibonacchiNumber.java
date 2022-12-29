
package biginnerjava;

import java.util.Scanner;

public class FibonacchiNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n,i;
        System.out.print("Enter any number : ");
        n = input.nextInt();
        
        int first = 0;
        int second = 1;
        int fibo;
        
        System.out.print(first+" "+second);
        for( i=3; i<=n; i++)
        {
            fibo = first + second;
            first = second;
            second = fibo;
            System.out.print(" "+fibo);
        }
        System.out.println();
    }
}
