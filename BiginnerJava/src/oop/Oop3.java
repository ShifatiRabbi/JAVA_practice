
package oop;

import java.util.Scanner;

public class Oop3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int decimal;
        System.out.print("Enter any decimal number : ");
        decimal = input.nextInt();
        
        String binary = Integer.toBinaryString(decimal);
        String octal = Integer.toOctalString(decimal);
        String hexa = Integer.toHexString(decimal);
        
        System.out.println("Binary = "+binary);
        System.out.println("Octal = "+octal);
        System.out.println("Hexadecimal = "+hexa);
        
    }
}
