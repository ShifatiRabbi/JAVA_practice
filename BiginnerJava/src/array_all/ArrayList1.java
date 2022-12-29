/*
    1. ArrayList Declear;
    2. Add digit;
    3. Remove digit
    4. Set digit
    5. Sort ArrayList
*/


package array_all;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();
        
        int n;
        System.out.print("Enter a digit : ");
        n = input.nextInt();
        System.out.println();
        System.out.print(n+" digit : ");
        for(int i=0; i<n; i++){
            number.add(i);
        }
        
        
        System.out.println(number);
        System.out.println("Length : "+number.size());
        
        number.add(5, 50);
        System.out.println(number);
        
        number.remove(7);
        System.out.println(number);
        
        boolean check = number.isEmpty();
        System.out.println(check);
        
        boolean contain = number.contains(6);
        System.out.println(contain);
        
        number.set(3, 45);
        for(int x : number)
        {
            System.out.print(x+" ");
        }
        
        int index = number.indexOf(9);
        System.out.println(index);
        System.out.println("Length : "+number.size());
        
        Collections.sort(number);
        System.out.println("Sort in ascending order : "+number);
        Collections.sort(number,Collections.reverseOrder());
        System.out.println("Sort in Descending order : "+number);
        
        
        number.clear();
        System.out.println(number);
        System.out.println("Length : "+number.size());
        
    }
}
