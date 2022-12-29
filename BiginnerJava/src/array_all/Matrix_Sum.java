
package array_all;

import java.util.Scanner;

public class Matrix_Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3];
        
        System.out.print("Enter a 3X3 matrix : ");
        for(int row=0; row<3; row++){
            
            for(int col=0; col<3; col++){
                A[row][col] = input.nextInt();
            }
            
        }
        System.out.print("Enter a 3X3 matrix : ");
        for(int row=0; row<3; row++){
            
            for(int col=0; col<3; col++){
                B[row][col] = input.nextInt();
            }
            
        }
        
        
        
        
        System.out.print("A : ");
        for(int row=0; row<3; row++){
            
            for(int col=0; col<3; col++){
                System.out.print("\t"+A[row][col]);
            }
            System.out.println();
            
        }
        System.out.println();
        System.out.println();
        System.out.print("B : ");
        for(int row=0; row<3; row++){
            
            for(int col=0; col<3; col++){
                System.out.print("\t"+B[row][col]);
            }
            System.out.println();
        }
        
        
        for(int row=0; row<3; row++){
            
            for(int col=0; col<3; col++){
                C[row][col] = A[row][col] + B[row][col];
            }
            
        }
        System.out.println();
        System.out.println();
        System.out.print("A + B = ");
        for(int row=0; row<3; row++){
            
            for(int col=0; col<3; col++){
                System.out.print("\t  "+C[row][col]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        int diagonal = 0;
        int upper = 0;
        int lower = 0;
        
        for(int row=0; row<3; row++){
            
            for(int col=0; col<3; col++){
                if( row == col ){
                    diagonal = diagonal + A[row][col];
                }
                else if( row < col ){
                    upper = upper + A[row][col];
                }
                else if( row > col ){
                    lower = lower + A[row][col];
                }
            }   
        }
        System.out.println("Upper sum for A = "+upper);
        System.out.println("Diagonal sum for A = "+diagonal);
        System.out.println("Lower sum for A = "+lower);
        
        System.out.println();
        System.out.println();
         diagonal = 0;
         upper = 0;
         lower = 0;
        
        for(int row=0; row<3; row++){
            
            for(int col=0; col<3; col++){
                if( row == col ){
                    diagonal = diagonal + B[row][col];
                }
                else if( row < col ){
                    upper = upper + B[row][col];
                }
                else if( row > col ){
                    lower = lower + B[row][col];
                }
            }   
        }
        System.out.println("Upper sum for B = "+upper);
        System.out.println("Diagonal sum for B = "+diagonal);
        System.out.println("Lower sum for B = "+lower);
    }
}
