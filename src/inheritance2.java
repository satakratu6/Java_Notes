import java.util.Scanner;
class MathOperation{
    int n1;
    int n2;
}
class ArithmeticOperations extends MathOperation{
    void inputNumbers(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        n1=sc.nextInt();
        System.out.print("Enter second number: ");
        n2=sc.nextInt();
    }
    void addition(){
        System.out.println("Additon : "+(n1+n2));
    }
    void difference(){
        System.out.println("Difference: "+(n1-n2));
    }
    void multiplication(){
        System.out.println("Multiplication: "+(n1*n2));
    }
    void division(){
        if(n2==0){
            System.out.println("Division by zero is not possible");
        } else{
        System.out.println("Division: "+(n1/n2));
        }
    }
    void quotient(){
        if(n2==0){
            System.out.println("Division by zero is not possible");
        } else{
            float quotient = (float)n1 / n2; // Calculate quotient
        System.out.printf("Quotient: %.1f", quotient);
        }
        
        
    }
}


public class inheritance2{
    public static void main(String[] args) {
        ArithmeticOperations a=new ArithmeticOperations();
        a.inputNumbers();;
        a.addition();
        a.difference();
        a.division();
        a.multiplication();
        a.quotient();
    }
}