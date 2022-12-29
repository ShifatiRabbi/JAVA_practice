
package biginnerjava;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, i, j, k;
        System.out.print("Enter a number : ");
        num = input.nextInt();
        
        for( i=1; i<=num; i++)
        {
            for(k=num-1; k>=i; k--)
            {
               System.out.print(" "); 
            }
            for(j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
