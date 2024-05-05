import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int n1=sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int n2=sc.nextInt();
        try {
            if (n2 == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            } else {
                int number = n1 / n2;
                System.out.println("Result: " + number);
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

