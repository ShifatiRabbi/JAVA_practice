
package algorithomcheck;

import java.util.Scanner;

public class FactorialTest {
    static int fact(int n)
    {   
      if(n==1)
      {
           return n;  
      }
      else
      {
            return n * fact(n-1);
            
      }
    }   
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();
        System.out.println(fact(n));
    }
}
