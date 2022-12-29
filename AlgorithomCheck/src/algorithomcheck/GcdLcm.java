
package algorithomcheck;

import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two digit : ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int num1 = n1, num2 = n2;
        int gcd,lcm,tmp,rm;
        while(n2 != 0){
            tmp = n2;
            n2 = n1 % n2;
            n1 = tmp;
        }
        gcd = n1;
        lcm = (num1 * num2) / gcd;
        
        System.out.println("\nThe gcd of "+num1+" and "+num2+" is : "+gcd);
        System.out.println("The lcm of "+num1+" and "+num2+" is : "+lcm);
    }
}
