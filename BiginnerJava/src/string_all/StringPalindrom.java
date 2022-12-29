
package string_all;

public class StringPalindrom {
    public static void main(String[] args) {
        String s1 = "madugam";
        StringBuffer s2 = new StringBuffer(s1);
        String s3 = s2.reverse().toString();
        
        if(s1.equals(s3))
        {
            System.out.println("Palindrom");
        }
        else
        {
            System.out.println("Not palindrom");
        }
        
        
    }
}
