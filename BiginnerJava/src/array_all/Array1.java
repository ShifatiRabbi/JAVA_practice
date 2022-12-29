/*  1. Array input
    2. Sum
    3. Average
    4. For each loop
    5. Max Min number
*/
package array_all;


import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter any number : ");
        n = input.nextInt();
        double[] number = new double[n];
        double sum = 0;
        
        System.out.println("Enter "+n+" number : ");
        for(int i=0; i<n; i++)
        {
            number[i] = input.nextDouble();
            sum = sum + number[i];
        }
        
        for(double x : number)
        {
            System.out.println(x);
        }
        double average = sum / n;
        System.out.println("Length = "+number.length);
        System.out.println("Sum = "+sum);
        System.out.println("Average is = "+average);
        
        double max = number[0];
        double min = number[0];
        
        for(double x : number)
        {
            if(max < x)
            {
                max = x;
            }
            if(min > x)
            {
                min = x;
            }
        }
        
        System.out.println("Max = "+max+" and Min = "+min);
        
    }
        
}   
    
    

    
