import java.util.Scanner;
class ageValidation extends Exception{
    public ageValidation(String s){
        super(s);
    }
}
public class invalidage {
    public static void age(int age) throws ageValidation{
        if(age<18){
            throw new ageValidation("You can't vote");
        } else{
            System.out.println("You are eligible to vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        try{
            age(n1);
        } catch(ageValidation e){
            System.out.println(e.getMessage());
        }

    }
}
