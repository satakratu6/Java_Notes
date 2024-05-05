import java.util.Scanner;
class InvalidInputLengthException extends Exception{
    InvalidInputLengthException(String message){
        super(message);
    }
}
public class exception4 {
    static void validateInputLength(String name, int length) throws InvalidInputLengthException{
        if(name.length()<length){
            throw new InvalidInputLengthException("Input length is invalid");
        } else{
            System.out.println("Input length is valid");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int length=sc.nextInt();
        try{
            validateInputLength(name, length);
        }
        catch(InvalidInputLengthException e){
            System.out.println(e.getMessage());
        }
    }
}
