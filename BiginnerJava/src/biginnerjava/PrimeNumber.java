
package biginnerjava;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num,i,count,x,m,n,j;
        double rootnum;
        
        System.out.print("Enter two number : ");
        m = input.nextInt();
        n = input.nextInt();
        
        for( j=m; j<=n; j++)
        {
            
            num = j;
            rootnum = Math.sqrt(num);
            x = (int) Math.ceil(rootnum);
            count=0;
            if(num==2)
            {
                System.out.println(num+" is prime");
                continue;
            }
            for( i=2; i<=x; i++)
            {
                if(num%i==0)
                {
                    count = 1;
                    break;
                }
            }

            if(num==1)
            {
                System.out.println(num+" is not prime");
            }
            else if(count==1)
            {
                System.out.println(num+" is not prime");
            }
            else if(count==0)
            {
                System.out.println(num+" is prime");
            }
        }
    }
}
