import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        System.out.println("First Character: "+str.charAt(0));
        System.out.println("Last Characrer: "+str.charAt(str.length()-1));
    }
}
