
package oop;

public class Oop2 {
    public static void main(String[] args) {
        
        // int and double to string
        
        int a = 10;
        double b = 20.234;
        String s1 = Integer.toString(a);
        String s2 = Double.toString(b);
        String s3 = s1 + s2;
        
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);
        System.out.println("s3 = "+s3);
        
        // string to int and double
        
        String s4 = "30";
        String s5 = "30.847";
        
        int x = Integer.parseInt(s4);
        double y = Double.parseDouble(s5);
        
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        
        
    }
}
