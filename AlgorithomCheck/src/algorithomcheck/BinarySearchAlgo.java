package algorithomcheck;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearchAlgo {
    
    public static void BinarySearch(int [] arr,int s)
    {
        int mid,left,right;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter array length : ");
        int n = input.nextInt();
        int  arr[] = new int[n];
        System.out.print("Enter array value : ");
        for(int i=0; i<n; i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.print("Enter a number you want to search : ");
        int s = input.nextInt();
        BinarySearch(arr,s);
    }
}
