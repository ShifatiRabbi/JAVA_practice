
package constructor;

public class Teacher {
    
    String name, gender;
    int age;
    double number;
    
    Teacher(){
        System.out.println("No value");
    }
    
    Teacher(double d){
        number = d;
        System.out.println("Number = "+number);
    }
    
    Teacher(String n, String g, int a){
        name = n;
        gender = g;
        age = a;
    }
    
    void displayInformation(){
        
        System.out.println("Name = "+name);
        System.out.println("Gender = "+gender);
        System.out.println("Age = "+age);
        System.out.println();
    }
    
    
}
