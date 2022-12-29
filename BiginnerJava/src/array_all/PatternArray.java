
package array_all;

import java.util.Scanner;

public class PatternArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[4][4];
        int z = 0;
        for(int row=0; row<4; row++){
            for(int col=0; col<=row; col++){
                A[row][col] = z;
                z++;
            }
        }
        
        
        for(int row=0; row<4; row++){
            for(int col=0; col<=row; col++){
                System.out.print(A[row][col]+" ");
            }
            System.out.println();
        }
        
        
    }
}
