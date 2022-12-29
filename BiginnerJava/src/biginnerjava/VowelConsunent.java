
package biginnerjava;

import java.util.Scanner;

public class VowelConsunent {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char x;
        System.out.print("Enter a letter : ");
        x = input.next().charAt(0);
        
        if( x=='a' || x=='e' || x=='i' || x=='o' || x=='u' ||
                x=='A' || x=='E' || x=='I' || x=='O' || x=='U')
            {
                System.out.println("The latter is VOWEL");
            }
        else
            {
                System.out.println("The latter is CONSUNANT");
            }
        
        
    }
}
