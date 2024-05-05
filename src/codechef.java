import java.util.Scanner;

class Code {
    public String name;

    // Constructor that takes a String parameter
    public Code(String name) {
        this.name = name;
    }

    // Copy Constructor
    public Code(Code c) {
        this.name = c.name;
    }
}

public class codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        
        // Creating an object using the constructor that takes a String parameter
        Code code = new Code(name);
        System.out.println("First constructor: " + code.name);
        
        // Creating an object using the copy constructor
        Code c = new Code(code);
        System.out.println("Copy Constructor: ");
        System.out.println(c.name);
    }
}
