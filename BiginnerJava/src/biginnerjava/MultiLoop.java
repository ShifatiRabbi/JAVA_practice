
package biginnerjava;

import java.util.Scanner;

public class MultiLoop {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num,i,multi,m,n,j;
        System.out.print("Enter two number : ");
        
        m = input.nextInt();
        n = input.nextInt();
        for( j = m; j <= n; j++)
        {
            num = j;
            for( i = 1; i <= 10; i++)
                {
                    multi = num * i;
                    System.out.println(num+" X "+i+" = "+multi);
                }
            System.out.println();
            System.out.println();
            System.out.println();
        }
        
        
    }
}
