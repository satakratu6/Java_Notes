import java.util.Scanner;
public class exception3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n1=sc.nextInt();
        try{
            String n1=sc.nextLine();
            int num=Integer.parseInt(n1);
            if(num<0){
                throw new IllegalArgumentException("Sqaure root of a negative number can't be possible");
            } else{
                System.err.println("Square root of the number is: "+Math.sqrt(num));
            }
        }
        catch(NumberFormatException e){
            System.out.println("Invalid input");
        } 
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
