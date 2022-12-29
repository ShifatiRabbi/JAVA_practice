
package biginnerjava;

import java.util.Scanner;

public class LoopMath {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int m,n,i,sum=0;
        
        m = input.nextInt();
        n = input.nextInt();
        
        for( i=m; i<=n; i++)
        {
            sum = (int) (sum + Math.pow(i, 2));
        }
        System.out.println(sum);
        
    }
}
