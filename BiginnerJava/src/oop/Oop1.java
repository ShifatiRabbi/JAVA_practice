
package oop;

public class Oop1 {
    public static void main(String[] args) {
        
        // int to object data
        int x = 30;
        Integer y = x;
        Integer z = Integer.valueOf(x);
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("z = "+z);
        
        // object to int data
        Integer a = new Integer(20);
        int b = a;
        int c = a.intValue();
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        
    }
}
