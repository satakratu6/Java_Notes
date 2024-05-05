import java.util.Scanner;
class InvalidAgeException extends Exception{
    InvalidAgeException(String str){
        super(str);
    }
}
public class exception2 {
    static void validation(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Not eligible to vote");
        } else{
            System.out.println("Eligible to Vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age");
        int age=sc.nextInt();
        try{
            validation(age);
        } catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
