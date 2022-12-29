
package array_all;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter any digit : ");
        n = input.nextInt();
        int[] A = new int[n];
        System.out.println("Enter "+n+" digit : ");
        
        for(int i=0; i<n; i++)
        {
            A[i] = input.nextInt();
        }
        Arrays.sort(A);
        System.out.println("Ascending order sort array : ");
        for(int i=0; i<n; i++)
        {
            System.out.print(" "+A[i]);
        }
        System.out.println();
        System.out.println();
        System.out.println("Decending order sort array : ");
        for(int i=n-1; i>=0; i--)
        {
            System.out.print(" "+A[i]);
        }
    }
}
