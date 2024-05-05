import java.util.Scanner;

public class interface2 {
    interface GetCharacter{
       public void displayChar(String inputString, int pos);
    }
    static class FirstCharacter implements GetCharacter{
        @Override
       public void displayChar(String inpuString, int pos){
            System.out.println("First character: "+inpuString.charAt(pos));
        }
    }
    static class LastCharacter implements GetCharacter{
        @Override
       public void displayChar(String inputString, int pos){
            System.out.println("Last Character: "+inputString.charAt(inputString.length()-1-pos));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        GetCharacter firstCharacterget=new FirstCharacter();
        firstCharacterget.displayChar(str, 0);
        GetCharacter lasCharacterget=new LastCharacter();
        lasCharacterget.displayChar(str, 0);

    }
}
