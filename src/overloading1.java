import java.util.Scanner;
class Addition{
    public int add(int n1, int n2){
        return n1+n2;
    }
    public double add(double n1, double n2){
        return n1+n2;
    }
    public double add(double n1, double n2, double n3){
        return n1+n2+n3; // corrected here
    }
}
public class overloading1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Addition addition=new Addition();
        System.out.print("Enter first number: ");
        int n1=sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int n2=sc.nextInt();
        System.out.println("Addition of two numbers: "+addition.add(n1,n2));
        double d1=n1; // corrected here
        double d2=n2; // corrected here
        System.out.println("Addition of two numbers: "+addition.add(d1,d2));
    }
}
