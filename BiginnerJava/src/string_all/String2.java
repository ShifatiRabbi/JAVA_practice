
package string_all;

public class String2 {
    public static void main(String[] args) {
        
        StringBuffer s1 = new StringBuffer("Shifati ");
        System.out.println(s1);
        
        s1.append("Rabbi");
        System.out.println(s1);
        
        s1.reverse();
        System.out.println(s1);
        
        s1.delete(2, 6);
        System.out.println(s1);
        
        s1.setLength(5);
        System.out.println(s1);
        
    }
}
