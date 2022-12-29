
package static_variable;

public class Static1 {
    
    int id;
    String name;
    static String country = "Bangladesh";
    
    Static1(int i, String n) {
        id = i;
        name = n;
    }
    
    void displayInformation() {
        System.out.println("ID = "+id );
        System.out.println("Name = "+name );
        System.out.println("Country = "+country );
        System.out.println();
    }
    
}
