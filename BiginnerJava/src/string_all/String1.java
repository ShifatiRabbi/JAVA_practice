
package string_all;

public class String1 {
    public static void main(String[] args) {
        String s1 = "Shifati Rabbi";
        String s2 = "shifati rabbi";
        String s3 = "   I love my country   ";
        
        System.out.println(s1);
        System.out.println(s3);
        
        
        int len1 = s1.length();
        int len3 = s3.length();
        System.out.println("s1 length = "+len1);
        System.out.println("s3 length = "+len3);
        
        
        boolean check1 = s1.equals(s2);
        System.out.println("check1 = "+check1);
        boolean check2 = s1.equalsIgnoreCase(s2);
        System.out.println("check2 = "+check2);
        boolean check3 = s2.isEmpty();
        System.out.println("check3 = "+check3);
        boolean check4 = s2.startsWith("sh");
        System.out.println("check4 = "+check4);
        boolean check5 = s2.endsWith("bi");
        System.out.println("check5 = "+check5);
        
        
        String s4 = s1.concat(s3);
        System.out.println(s4);
        s2 = s4.toUpperCase();
        System.out.println(s2);
        s2 = s4.toLowerCase();
        System.out.println(s2);
        s2 = s3.trim();
        System.out.println(s2);
        
        
        s2 = s2.replace('o', 'i');
        System.out.println(s2);
        
        String[] s5 = s4.split(" ");
        for(String x : s5){
            System.out.println(x);
        }
    }
}
