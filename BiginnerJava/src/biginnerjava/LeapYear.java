
package biginnerjava;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int year;
        System.out.print("Enter a year : ");
        year = input.nextInt();
        
        if(year%100==0)
            {
               if(year%400==0)
                    {
                        System.out.println("The year is a Leap year");
                    }
                else
                    {
                        System.out.println("The year is a Non-leap year");
                    } 
            }
        else if(year%4==0)
            {
                System.out.println("The year is a Leap year");
            }
        else
            {
                System.out.println("The year is a Non-leap year");
            }
        
        
    }
}
