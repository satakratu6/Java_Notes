import java.util.Scanner;
interface PasswordChecker{
    String checkLength(String password);
    String checkComplexity(String password);
}
class simplePasswordChecker implements PasswordChecker{
    
    public String checkLength(String password){
        return "Length: "+ password.length();
    }
    
    public String checkComplexity(String password){
        if(password.length()<8){
            return "weak";
        }
        else if(password.length()==8){
            return "medium";
        }
        else{
            return "strong";
        }
    }
    
}
public class interface3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Write password: ");
        String password=sc.nextLine();
        PasswordChecker p=new simplePasswordChecker();
        System.out.println(p.checkLength(password));
        System.out.println(p.checkComplexity(password));
    }
}
