import java.util.Scanner;

// class NegativeNumberException extends Exception {
//     public NegativeNumberException(String message) {
//         super(message);
//     }
// }

// public class SquareRootCalculator {

//     public static double calculateSquareRoot(double number) throws NegativeNumberException {
//         if (number < 0) {
//             throw new NegativeNumberException("Cannot calculate square root of a negative number");
//         }
//         return Math.sqrt(number);
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         double userInput = scanner.nextDouble();

//         try {
//             double result = calculateSquareRoot(userInput);
//             System.out.println("Square root of " + userInput + " is: " + result);
//         } catch (NegativeNumberException e) {
//             System.out.println("Error: " + e.getMessage());
//         } finally {
//             scanner.close();
//         }
//     }
// }
class Negative extends Exception{
    public Negative(String m){
        super(m);
    }
}
public class SquareRootCalculator{
    public static double squareRoot(double n) throws Negative{
        if(n<0){
            throw new Negative("Can't possible");
        } 
        return Math.sqrt(n);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number");
        double n1=sc.nextDouble();
        try{
            double result=squareRoot(n1);
            System.out.println("result: "+result);
        }
        catch(Negative e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}